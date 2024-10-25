
package net.mcreator.pondersroleplaymod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.pondersroleplaymod.procedures.FlashlightRightclickedProcedure;
import net.mcreator.pondersroleplaymod.procedures.FlashlightOffRightClickProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModTabs;

public class FlashlightOffItem extends Item {
	public FlashlightOffItem() {
		super(new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_TOOLS).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FlashlightRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FlashlightOffRightClickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
