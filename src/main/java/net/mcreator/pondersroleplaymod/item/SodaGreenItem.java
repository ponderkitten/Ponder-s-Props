
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;

public class SodaGreenItem extends Item {
	public SodaGreenItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_RP_ITEMS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(PondersRoleplayModModItems.SODA_EMPTY.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
