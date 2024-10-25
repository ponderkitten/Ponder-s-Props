
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyPepsiBottleItem extends Item {
	public EmptyPepsiBottleItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
