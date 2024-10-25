
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;

import java.util.List;

public class CreditCardItem extends Item {
	public CreditCardItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_RP_ITEMS).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Used to pay without cash"));
	}
}
