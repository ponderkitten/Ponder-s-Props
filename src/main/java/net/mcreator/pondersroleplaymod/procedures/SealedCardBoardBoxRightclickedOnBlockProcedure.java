package net.mcreator.pondersroleplaymod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

import java.util.concurrent.atomic.AtomicReference;

public class SealedCardBoardBoxRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		double slot0 = 0;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR && entity.isShiftKeyDown() == true
				&& Direction.UP == (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.SEALED_CARD_BOARD_BOX.get()) {
			slot = 0;
			world.setBlock(new BlockPos(x, y + 1, z), PondersRoleplayModModBlocks.HOME_DEPOT_BOX_CLOSED.get().defaultBlockState(), 3);
			{
				Direction _dir = (entity.getDirection());
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
			while (slot < 36) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
					if (_ent != null) {
						final int _slotid = (int) slot;
						final ItemStack _setstack = (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack((int) slot, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)));
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble(("slot" + slot))));
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				slot = slot + 1;
			}
		}
	}
}
