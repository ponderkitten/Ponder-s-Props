package net.mcreator.pondersroleplaymod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

import java.util.Map;

public class CoffeeBeanBagProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (PondersRoleplayModModBlocks.COFFEE_BEAN_BAG_CLOSED.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.BOX_CUTTER.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PondersRoleplayModModBlocks.COFFEE_BEAN_BAG_OPEN.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		} else if (PondersRoleplayModModBlocks.COFFEE_BEAN_BAG_OPEN.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.PACKING_TAPE.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PondersRoleplayModModBlocks.COFFEE_BEAN_BAG_CLOSED.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PondersRoleplayModModItems.SCOOP.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.SCOOP_OF_BEANS.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.COFFEE_BEAN.get());
					_setstack.setCount(5);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
