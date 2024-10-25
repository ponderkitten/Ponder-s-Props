
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.pondersroleplaymod.client.gui.TrashPage2Screen;
import net.mcreator.pondersroleplaymod.client.gui.TrashPage1Screen;
import net.mcreator.pondersroleplaymod.client.gui.SodaDispensorGuiScreen;
import net.mcreator.pondersroleplaymod.client.gui.Registerpage1Screen;
import net.mcreator.pondersroleplaymod.client.gui.Popcornpage2Screen;
import net.mcreator.pondersroleplaymod.client.gui.Popcornpage1Screen;
import net.mcreator.pondersroleplaymod.client.gui.PepsiGUIScreen;
import net.mcreator.pondersroleplaymod.client.gui.MopPage2Screen;
import net.mcreator.pondersroleplaymod.client.gui.MopPage1Screen;
import net.mcreator.pondersroleplaymod.client.gui.IndexScreen;
import net.mcreator.pondersroleplaymod.client.gui.IceCreamSelectionScreen;
import net.mcreator.pondersroleplaymod.client.gui.CoffeePage4Screen;
import net.mcreator.pondersroleplaymod.client.gui.CoffeePage3Screen;
import net.mcreator.pondersroleplaymod.client.gui.CoffeePage2Screen;
import net.mcreator.pondersroleplaymod.client.gui.CoffeePage1Screen;
import net.mcreator.pondersroleplaymod.client.gui.CoffeePage1HalfScreen;
import net.mcreator.pondersroleplaymod.client.gui.CocaColaGUIScreen;
import net.mcreator.pondersroleplaymod.client.gui.ClawMachineGUIScreen;
import net.mcreator.pondersroleplaymod.client.gui.CardBoardBoxScreen;
import net.mcreator.pondersroleplaymod.client.gui.Broom1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PondersRoleplayModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PondersRoleplayModModMenus.INDEX.get(), IndexScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.CARD_BOARD_BOX.get(), CardBoardBoxScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.BROOM_1.get(), Broom1Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.TRASH_PAGE_1.get(), TrashPage1Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.TRASH_PAGE_2.get(), TrashPage2Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.MOP_PAGE_1.get(), MopPage1Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.MOP_PAGE_2.get(), MopPage2Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.REGISTERPAGE_1.get(), Registerpage1Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.POPCORNPAGE_1.get(), Popcornpage1Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.POPCORNPAGE_2.get(), Popcornpage2Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.COFFEE_PAGE_1.get(), CoffeePage1Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.COFFEE_PAGE_2.get(), CoffeePage2Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.COFFEE_PAGE_3.get(), CoffeePage3Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.COFFEE_PAGE_4.get(), CoffeePage4Screen::new);
			MenuScreens.register(PondersRoleplayModModMenus.COFFEE_PAGE_1_HALF.get(), CoffeePage1HalfScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.CLAW_MACHINE_GUI.get(), ClawMachineGUIScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.SODA_DISPENSOR_GUI.get(), SodaDispensorGuiScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.PEPSI_GUI.get(), PepsiGUIScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.COCA_COLA_GUI.get(), CocaColaGUIScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.ICE_CREAM_SELECTION.get(), IceCreamSelectionScreen::new);
			MenuScreens.register(PondersRoleplayModModMenus.TOOL_WALL_P_SCREWDRIVER.get(), ToolWallPScrewdriverScreen::new);
		});
	}
}
