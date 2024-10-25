
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.pondersroleplaymod.world.inventory.TrashPage2Menu;
import net.mcreator.pondersroleplaymod.world.inventory.TrashPage1Menu;
import net.mcreator.pondersroleplaymod.world.inventory.SodaDispensorGuiMenu;
import net.mcreator.pondersroleplaymod.world.inventory.Registerpage1Menu;
import net.mcreator.pondersroleplaymod.world.inventory.Popcornpage2Menu;
import net.mcreator.pondersroleplaymod.world.inventory.Popcornpage1Menu;
import net.mcreator.pondersroleplaymod.world.inventory.PepsiGUIMenu;
import net.mcreator.pondersroleplaymod.world.inventory.MopPage2Menu;
import net.mcreator.pondersroleplaymod.world.inventory.MopPage1Menu;
import net.mcreator.pondersroleplaymod.world.inventory.IndexMenu;
import net.mcreator.pondersroleplaymod.world.inventory.IceCreamSelectionMenu;
import net.mcreator.pondersroleplaymod.world.inventory.CoffeePage4Menu;
import net.mcreator.pondersroleplaymod.world.inventory.CoffeePage3Menu;
import net.mcreator.pondersroleplaymod.world.inventory.CoffeePage2Menu;
import net.mcreator.pondersroleplaymod.world.inventory.CoffeePage1Menu;
import net.mcreator.pondersroleplaymod.world.inventory.CoffeePage1HalfMenu;
import net.mcreator.pondersroleplaymod.world.inventory.CocaColaGUIMenu;
import net.mcreator.pondersroleplaymod.world.inventory.ClawMachineGUIMenu;
import net.mcreator.pondersroleplaymod.world.inventory.CardBoardBoxMenu;
import net.mcreator.pondersroleplaymod.world.inventory.Broom1Menu;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

public class PondersRoleplayModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PondersRoleplayModMod.MODID);
	public static final RegistryObject<MenuType<IndexMenu>> INDEX = REGISTRY.register("index", () -> IForgeMenuType.create(IndexMenu::new));
	public static final RegistryObject<MenuType<CardBoardBoxMenu>> CARD_BOARD_BOX = REGISTRY.register("card_board_box", () -> IForgeMenuType.create(CardBoardBoxMenu::new));
	public static final RegistryObject<MenuType<Broom1Menu>> BROOM_1 = REGISTRY.register("broom_1", () -> IForgeMenuType.create(Broom1Menu::new));
	public static final RegistryObject<MenuType<TrashPage1Menu>> TRASH_PAGE_1 = REGISTRY.register("trash_page_1", () -> IForgeMenuType.create(TrashPage1Menu::new));
	public static final RegistryObject<MenuType<TrashPage2Menu>> TRASH_PAGE_2 = REGISTRY.register("trash_page_2", () -> IForgeMenuType.create(TrashPage2Menu::new));
	public static final RegistryObject<MenuType<MopPage1Menu>> MOP_PAGE_1 = REGISTRY.register("mop_page_1", () -> IForgeMenuType.create(MopPage1Menu::new));
	public static final RegistryObject<MenuType<MopPage2Menu>> MOP_PAGE_2 = REGISTRY.register("mop_page_2", () -> IForgeMenuType.create(MopPage2Menu::new));
	public static final RegistryObject<MenuType<Registerpage1Menu>> REGISTERPAGE_1 = REGISTRY.register("registerpage_1", () -> IForgeMenuType.create(Registerpage1Menu::new));
	public static final RegistryObject<MenuType<Popcornpage1Menu>> POPCORNPAGE_1 = REGISTRY.register("popcornpage_1", () -> IForgeMenuType.create(Popcornpage1Menu::new));
	public static final RegistryObject<MenuType<Popcornpage2Menu>> POPCORNPAGE_2 = REGISTRY.register("popcornpage_2", () -> IForgeMenuType.create(Popcornpage2Menu::new));
	public static final RegistryObject<MenuType<CoffeePage1Menu>> COFFEE_PAGE_1 = REGISTRY.register("coffee_page_1", () -> IForgeMenuType.create(CoffeePage1Menu::new));
	public static final RegistryObject<MenuType<CoffeePage2Menu>> COFFEE_PAGE_2 = REGISTRY.register("coffee_page_2", () -> IForgeMenuType.create(CoffeePage2Menu::new));
	public static final RegistryObject<MenuType<CoffeePage3Menu>> COFFEE_PAGE_3 = REGISTRY.register("coffee_page_3", () -> IForgeMenuType.create(CoffeePage3Menu::new));
	public static final RegistryObject<MenuType<CoffeePage4Menu>> COFFEE_PAGE_4 = REGISTRY.register("coffee_page_4", () -> IForgeMenuType.create(CoffeePage4Menu::new));
	public static final RegistryObject<MenuType<CoffeePage1HalfMenu>> COFFEE_PAGE_1_HALF = REGISTRY.register("coffee_page_1_half", () -> IForgeMenuType.create(CoffeePage1HalfMenu::new));
	public static final RegistryObject<MenuType<ClawMachineGUIMenu>> CLAW_MACHINE_GUI = REGISTRY.register("claw_machine_gui", () -> IForgeMenuType.create(ClawMachineGUIMenu::new));
	public static final RegistryObject<MenuType<SodaDispensorGuiMenu>> SODA_DISPENSOR_GUI = REGISTRY.register("soda_dispensor_gui", () -> IForgeMenuType.create(SodaDispensorGuiMenu::new));
	public static final RegistryObject<MenuType<PepsiGUIMenu>> PEPSI_GUI = REGISTRY.register("pepsi_gui", () -> IForgeMenuType.create(PepsiGUIMenu::new));
	public static final RegistryObject<MenuType<CocaColaGUIMenu>> COCA_COLA_GUI = REGISTRY.register("coca_cola_gui", () -> IForgeMenuType.create(CocaColaGUIMenu::new));
	public static final RegistryObject<MenuType<IceCreamSelectionMenu>> ICE_CREAM_SELECTION = REGISTRY.register("ice_cream_selection", () -> IForgeMenuType.create(IceCreamSelectionMenu::new));
	public static final RegistryObject<MenuType<ToolWallPScrewdriverMenu>> TOOL_WALL_P_SCREWDRIVER = REGISTRY.register("tool_wall_p_screwdriver", () -> IForgeMenuType.create(ToolWallPScrewdriverMenu::new));
}
