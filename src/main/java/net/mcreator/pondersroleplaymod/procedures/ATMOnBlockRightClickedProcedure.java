package net.mcreator.pondersroleplaymod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

public class ATMOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (PondersRoleplayModModBlocks.CHANGE_MACHINE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (PondersRoleplayModModItems.MONEYS.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.MONEYS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.QUARTER.get());
					_setstack.setCount(4);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		} else if (PondersRoleplayModModBlocks.ATM.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (PondersRoleplayModModItems.CREDIT_CARD.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.MONEYS.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (PondersRoleplayModModItems.MONEYS.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PondersRoleplayModModItems.MONEYS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
