
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PhoneItem extends Item {
	public PhoneItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.RARE));
	}
}