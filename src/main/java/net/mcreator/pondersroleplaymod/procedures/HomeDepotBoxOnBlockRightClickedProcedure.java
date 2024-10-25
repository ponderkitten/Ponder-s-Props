package net.mcreator.pondersroleplaymod.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.world.inventory.CardBoardBoxMenu;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class HomeDepotBoxOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("minecraft:shulker_box", true);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (PondersRoleplayModModBlocks.HOME_DEPOT_BOX_CLOSED.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (PondersRoleplayModModItems.BOX_CUTTER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PondersRoleplayModModBlocks.HOME_DEPOT_BOX_OPEN.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if (ItemStack.EMPTY.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() && entity.isShiftKeyDown() == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.SEALED_CARD_BOARD_BOX.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				slot = 0;
				while (slot < 36) {
					{
						ItemStack _isc = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						final ItemStack _setstack = (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), (int) slot));
						final int _sltid = (int) slot;
						_setstack.setCount(new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), (int) slot));
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble(("slot" + slot), (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), (int) slot)));
					slot = 1 + slot;
				}
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		} else if (PondersRoleplayModModBlocks.HOME_DEPOT_BOX_OPEN.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (PondersRoleplayModModItems.PACKING_TAPE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PondersRoleplayModModBlocks.HOME_DEPOT_BOX_CLOSED.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if (!(PondersRoleplayModModItems.BOX_CUTTER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
					|| PondersRoleplayModModItems.PACKING_TAPE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("CardBoardBox");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new CardBoardBoxMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
		}
	}
}
