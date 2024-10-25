
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GumballPurpleItem extends Item {
	public GumballPurpleItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(20f).alwaysEat()

				.build()));
	}
}
