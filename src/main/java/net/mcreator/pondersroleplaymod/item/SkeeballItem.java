
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;

public class SkeeballItem extends Item {
	public SkeeballItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_RP_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
