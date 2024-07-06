
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PondersRoleplayModModTabs {
	public static CreativeModeTab TAB_PONDERS_RP_ITEMS;
	public static CreativeModeTab TAB_PONDERS_ROLE_PLAY;

	public static void load() {
		TAB_PONDERS_RP_ITEMS = new CreativeModeTab("tabponders_rp_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PondersRoleplayModModItems.EMPTY_TRASH_BAG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PONDERS_ROLE_PLAY = new CreativeModeTab("tabponders_role_play") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PondersRoleplayModModBlocks.FULL_TRASH_BIN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
