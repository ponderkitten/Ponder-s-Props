package net.mcreator.pondersroleplaymod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

public class BoardRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() == true && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.BOARD.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.HAMMER.get()) {
			if (Direction.NORTH == (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())) {
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y, z - 1), PondersRoleplayModModBlocks.WOODEN_BOARDS_1.get().defaultBlockState(), 3);
					{
						Direction _dir = ((entity.getDirection()).getOpposite());
						BlockPos _pos = new BlockPos(x, y, z - 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.BOARD.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if (Direction.SOUTH == (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())) {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y, z + 1), PondersRoleplayModModBlocks.WOODEN_BOARDS_1.get().defaultBlockState(), 3);
					{
						Direction _dir = ((entity.getDirection()).getOpposite());
						BlockPos _pos = new BlockPos(x, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.BOARD.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if (Direction.WEST == (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x - 1, y, z), PondersRoleplayModModBlocks.WOODEN_BOARDS_1.get().defaultBlockState(), 3);
					{
						Direction _dir = ((entity.getDirection()).getOpposite());
						BlockPos _pos = new BlockPos(x - 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.BOARD.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if (Direction.EAST == (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x + 1, y, z), PondersRoleplayModModBlocks.WOODEN_BOARDS_1.get().defaultBlockState(), 3);
					{
						Direction _dir = ((entity.getDirection()).getOpposite());
						BlockPos _pos = new BlockPos(x + 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.BOARD.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR && entity.isShiftKeyDown() == true
				&& Direction.UP == (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.HAMMER.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			world.setBlock(new BlockPos(x, y + 1, z), PondersRoleplayModModBlocks.HAMMER_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.HAMMER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				Direction _dir = ((entity.getDirection()).getOpposite());
				BlockPos _pos = new BlockPos(x, y + 1, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
	}
}
