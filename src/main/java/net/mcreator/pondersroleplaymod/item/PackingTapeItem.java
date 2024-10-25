
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.pondersroleplaymod.procedures.TapeRightCLickProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;

public class PackingTapeItem extends Item {
	public PackingTapeItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TapeRightCLickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
