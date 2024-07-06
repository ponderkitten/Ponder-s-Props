
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;

public class WaterMopBucketItem extends Item {
	public WaterMopBucketItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_RP_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
