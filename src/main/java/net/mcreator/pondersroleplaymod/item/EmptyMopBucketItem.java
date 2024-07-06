
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.pondersroleplaymod.procedures.MopBucketItemRightclickedOnBlockProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;

public class EmptyMopBucketItem extends Item {
	public EmptyMopBucketItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_RP_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MopBucketItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
