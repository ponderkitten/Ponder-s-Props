
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PopcornItem extends Item {
	public PopcornItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}
}
