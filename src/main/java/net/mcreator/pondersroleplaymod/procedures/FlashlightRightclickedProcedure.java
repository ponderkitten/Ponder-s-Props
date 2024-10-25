package net.mcreator.pondersroleplaymod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;

public class FlashlightRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (PondersRoleplayModModItems.FLASHLIGHT_ON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.FLASHLIGHT_OFF.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (PondersRoleplayModModItems.FLASHLIGHT_OFF.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(PondersRoleplayModModItems.FLASHLIGHT_ON.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
