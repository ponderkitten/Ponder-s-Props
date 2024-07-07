
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pondersroleplaymod.item.WetMopItem;
import net.mcreator.pondersroleplaymod.item.WaterMopBucketItem;
import net.mcreator.pondersroleplaymod.item.TrashItemItem;
import net.mcreator.pondersroleplaymod.item.SodaYellowItem;
import net.mcreator.pondersroleplaymod.item.SodaRedItem;
import net.mcreator.pondersroleplaymod.item.SodaGreenItem;
import net.mcreator.pondersroleplaymod.item.SodaEmptyItem;
import net.mcreator.pondersroleplaymod.item.SodaBlueItem;
import net.mcreator.pondersroleplaymod.item.RegisterKeyItem;
import net.mcreator.pondersroleplaymod.item.PoopyMopItem;
import net.mcreator.pondersroleplaymod.item.PeeSoakedMopItem;
import net.mcreator.pondersroleplaymod.item.PeeMopBucketItem;
import net.mcreator.pondersroleplaymod.item.MopItem;
import net.mcreator.pondersroleplaymod.item.MoneysItem;
import net.mcreator.pondersroleplaymod.item.FullTrashBagItem;
import net.mcreator.pondersroleplaymod.item.FullDustPanItem;
import net.mcreator.pondersroleplaymod.item.EmptyTrashBagItem;
import net.mcreator.pondersroleplaymod.item.EmptyMopBucketItem;
import net.mcreator.pondersroleplaymod.item.DustPanItem;
import net.mcreator.pondersroleplaymod.item.DiarrheaMopBucketItem;
import net.mcreator.pondersroleplaymod.item.DeadChildItem;
import net.mcreator.pondersroleplaymod.item.BroomItem;
import net.mcreator.pondersroleplaymod.item.BoxCutterItem;
import net.mcreator.pondersroleplaymod.item.BloodyMopItem;
import net.mcreator.pondersroleplaymod.item.BloodyMopBucketItem;
import net.mcreator.pondersroleplaymod.block.display.WaterPuddleDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.WallBroomDustpanDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.WallBroomDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.TrashbinStage2DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.TrashbinStage1DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.TrashBinStage3DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.TrashBinEmptyDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.TrashBagBoxOpenDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.TrashBagBoxClosedDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.Trash5DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.Trash4DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.Trash3DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.Trash2DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.Trash1DisplayItem;
import net.mcreator.pondersroleplaymod.block.display.SodaFillYellowDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.SodaFillRedDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.SodaFillGreenDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.SodaFillBlueDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.SodaDispensorDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.SinkDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.PoopPuddleDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.PeePuddleDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.MopandBucketDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.MopBucketDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.FullTrashBinDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.DrainWaterDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.DrainPoopDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.DrainPeeDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.DrainDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.DrainBloodDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.CashRegisterOpenDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.CashRegisterClosedDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.BloodPuddleDisplayItem;
import net.mcreator.pondersroleplaymod.block.display.BaggedTrashBinDisplayItem;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

public class PondersRoleplayModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PondersRoleplayModMod.MODID);
	public static final RegistryObject<Item> TRASHBIN_STAGE_1 = REGISTRY.register(PondersRoleplayModModBlocks.TRASHBIN_STAGE_1.getId().getPath(),
			() -> new TrashbinStage1DisplayItem(PondersRoleplayModModBlocks.TRASHBIN_STAGE_1.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_BIN_EMPTY = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_BIN_EMPTY.getId().getPath(),
			() -> new TrashBinEmptyDisplayItem(PondersRoleplayModModBlocks.TRASH_BIN_EMPTY.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> TRASHBIN_STAGE_2 = REGISTRY.register(PondersRoleplayModModBlocks.TRASHBIN_STAGE_2.getId().getPath(),
			() -> new TrashbinStage2DisplayItem(PondersRoleplayModModBlocks.TRASHBIN_STAGE_2.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_BIN_STAGE_3 = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_BIN_STAGE_3.getId().getPath(),
			() -> new TrashBinStage3DisplayItem(PondersRoleplayModModBlocks.TRASH_BIN_STAGE_3.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FULL_TRASH_BIN = REGISTRY.register(PondersRoleplayModModBlocks.FULL_TRASH_BIN.getId().getPath(),
			() -> new FullTrashBinDisplayItem(PondersRoleplayModModBlocks.FULL_TRASH_BIN.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> BAGGED_TRASH_BIN = REGISTRY.register(PondersRoleplayModModBlocks.BAGGED_TRASH_BIN.getId().getPath(),
			() -> new BaggedTrashBinDisplayItem(PondersRoleplayModModBlocks.BAGGED_TRASH_BIN.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> EMPTY_TRASH_BAG = REGISTRY.register("empty_trash_bag", () -> new EmptyTrashBagItem());
	public static final RegistryObject<Item> FULL_TRASH_BAG = REGISTRY.register("full_trash_bag", () -> new FullTrashBagItem());
	public static final RegistryObject<Item> DEAD_CHILD = REGISTRY.register("dead_child", () -> new DeadChildItem());
	public static final RegistryObject<Item> SODA_DISPENSOR = REGISTRY.register(PondersRoleplayModModBlocks.SODA_DISPENSOR.getId().getPath(),
			() -> new SodaDispensorDisplayItem(PondersRoleplayModModBlocks.SODA_DISPENSOR.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> SODA_FILL_RED = REGISTRY.register(PondersRoleplayModModBlocks.SODA_FILL_RED.getId().getPath(),
			() -> new SodaFillRedDisplayItem(PondersRoleplayModModBlocks.SODA_FILL_RED.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SODA_FILL_GREEN = REGISTRY.register(PondersRoleplayModModBlocks.SODA_FILL_GREEN.getId().getPath(),
			() -> new SodaFillGreenDisplayItem(PondersRoleplayModModBlocks.SODA_FILL_GREEN.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SODA_FILL_BLUE = REGISTRY.register(PondersRoleplayModModBlocks.SODA_FILL_BLUE.getId().getPath(),
			() -> new SodaFillBlueDisplayItem(PondersRoleplayModModBlocks.SODA_FILL_BLUE.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SODA_FILL_YELLOW = REGISTRY.register(PondersRoleplayModModBlocks.SODA_FILL_YELLOW.getId().getPath(),
			() -> new SodaFillYellowDisplayItem(PondersRoleplayModModBlocks.SODA_FILL_YELLOW.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SODA_RED = REGISTRY.register("soda_red", () -> new SodaRedItem());
	public static final RegistryObject<Item> SODA_BLUE = REGISTRY.register("soda_blue", () -> new SodaBlueItem());
	public static final RegistryObject<Item> SODA_YELLOW = REGISTRY.register("soda_yellow", () -> new SodaYellowItem());
	public static final RegistryObject<Item> SODA_GREEN = REGISTRY.register("soda_green", () -> new SodaGreenItem());
	public static final RegistryObject<Item> SODA_EMPTY = REGISTRY.register("soda_empty", () -> new SodaEmptyItem());
	public static final RegistryObject<Item> WATER_MOP_BUCKET = REGISTRY.register("water_mop_bucket", () -> new WaterMopBucketItem());
	public static final RegistryObject<Item> BLOODY_MOP_BUCKET = REGISTRY.register("bloody_mop_bucket", () -> new BloodyMopBucketItem());
	public static final RegistryObject<Item> PEE_MOP_BUCKET = REGISTRY.register("pee_mop_bucket", () -> new PeeMopBucketItem());
	public static final RegistryObject<Item> DIARRHEA_MOP_BUCKET = REGISTRY.register("diarrhea_mop_bucket", () -> new DiarrheaMopBucketItem());
	public static final RegistryObject<Item> MOP = REGISTRY.register("mop", () -> new MopItem());
	public static final RegistryObject<Item> MOPAND_BUCKET = REGISTRY.register(PondersRoleplayModModBlocks.MOPAND_BUCKET.getId().getPath(),
			() -> new MopandBucketDisplayItem(PondersRoleplayModModBlocks.MOPAND_BUCKET.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> MOP_BUCKET = REGISTRY.register(PondersRoleplayModModBlocks.MOP_BUCKET.getId().getPath(), () -> new MopBucketDisplayItem(PondersRoleplayModModBlocks.MOP_BUCKET.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> EMPTY_MOP_BUCKET = REGISTRY.register("empty_mop_bucket", () -> new EmptyMopBucketItem());
	public static final RegistryObject<Item> BLOODY_MOP = REGISTRY.register("bloody_mop", () -> new BloodyMopItem());
	public static final RegistryObject<Item> POOPY_MOP = REGISTRY.register("poopy_mop", () -> new PoopyMopItem());
	public static final RegistryObject<Item> PEE_SOAKED_MOP = REGISTRY.register("pee_soaked_mop", () -> new PeeSoakedMopItem());
	public static final RegistryObject<Item> WET_MOP = REGISTRY.register("wet_mop", () -> new WetMopItem());
	public static final RegistryObject<Item> WATER_PUDDLE = REGISTRY.register(PondersRoleplayModModBlocks.WATER_PUDDLE.getId().getPath(),
			() -> new WaterPuddleDisplayItem(PondersRoleplayModModBlocks.WATER_PUDDLE.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> PEE_PUDDLE = REGISTRY.register(PondersRoleplayModModBlocks.PEE_PUDDLE.getId().getPath(),
			() -> new PeePuddleDisplayItem(PondersRoleplayModModBlocks.PEE_PUDDLE.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> BLOOD_PUDDLE = REGISTRY.register(PondersRoleplayModModBlocks.BLOOD_PUDDLE.getId().getPath(),
			() -> new BloodPuddleDisplayItem(PondersRoleplayModModBlocks.BLOOD_PUDDLE.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> POOP_PUDDLE = REGISTRY.register(PondersRoleplayModModBlocks.POOP_PUDDLE.getId().getPath(),
			() -> new PoopPuddleDisplayItem(PondersRoleplayModModBlocks.POOP_PUDDLE.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> SINK = REGISTRY.register(PondersRoleplayModModBlocks.SINK.getId().getPath(),
			() -> new SinkDisplayItem(PondersRoleplayModModBlocks.SINK.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> DRAIN = REGISTRY.register(PondersRoleplayModModBlocks.DRAIN.getId().getPath(),
			() -> new DrainDisplayItem(PondersRoleplayModModBlocks.DRAIN.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> DRAIN_WATER = REGISTRY.register(PondersRoleplayModModBlocks.DRAIN_WATER.getId().getPath(), () -> new DrainWaterDisplayItem(PondersRoleplayModModBlocks.DRAIN_WATER.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DRAIN_PEE = REGISTRY.register(PondersRoleplayModModBlocks.DRAIN_PEE.getId().getPath(), () -> new DrainPeeDisplayItem(PondersRoleplayModModBlocks.DRAIN_PEE.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DRAIN_BLOOD = REGISTRY.register(PondersRoleplayModModBlocks.DRAIN_BLOOD.getId().getPath(), () -> new DrainBloodDisplayItem(PondersRoleplayModModBlocks.DRAIN_BLOOD.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DRAIN_POOP = REGISTRY.register(PondersRoleplayModModBlocks.DRAIN_POOP.getId().getPath(), () -> new DrainPoopDisplayItem(PondersRoleplayModModBlocks.DRAIN_POOP.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SHADOW = block(PondersRoleplayModModBlocks.SHADOW, PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY);
	public static final RegistryObject<Item> TRASH_BAG_BOX_CLOSED = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_BAG_BOX_CLOSED.getId().getPath(),
			() -> new TrashBagBoxClosedDisplayItem(PondersRoleplayModModBlocks.TRASH_BAG_BOX_CLOSED.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> BOX_CUTTER = REGISTRY.register("box_cutter", () -> new BoxCutterItem());
	public static final RegistryObject<Item> TRASH_BAG_BOX_OPEN = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_BAG_BOX_OPEN.getId().getPath(),
			() -> new TrashBagBoxOpenDisplayItem(PondersRoleplayModModBlocks.TRASH_BAG_BOX_OPEN.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> CASH_REGISTER_CLOSED = REGISTRY.register(PondersRoleplayModModBlocks.CASH_REGISTER_CLOSED.getId().getPath(),
			() -> new CashRegisterClosedDisplayItem(PondersRoleplayModModBlocks.CASH_REGISTER_CLOSED.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> CASH_REGISTER_OPEN = REGISTRY.register(PondersRoleplayModModBlocks.CASH_REGISTER_OPEN.getId().getPath(),
			() -> new CashRegisterOpenDisplayItem(PondersRoleplayModModBlocks.CASH_REGISTER_OPEN.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> REGISTER_KEY = REGISTRY.register("register_key", () -> new RegisterKeyItem());
	public static final RegistryObject<Item> MONEYS = REGISTRY.register("moneys", () -> new MoneysItem());
	public static final RegistryObject<Item> BROOM = REGISTRY.register("broom", () -> new BroomItem());
	public static final RegistryObject<Item> DUST_PAN = REGISTRY.register("dust_pan", () -> new DustPanItem());
	public static final RegistryObject<Item> FULL_DUST_PAN = REGISTRY.register("full_dust_pan", () -> new FullDustPanItem());
	public static final RegistryObject<Item> WALL_BROOM = REGISTRY.register(PondersRoleplayModModBlocks.WALL_BROOM.getId().getPath(), () -> new WallBroomDisplayItem(PondersRoleplayModModBlocks.WALL_BROOM.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> WALL_BROOM_DUSTPAN = REGISTRY.register(PondersRoleplayModModBlocks.WALL_BROOM_DUSTPAN.getId().getPath(),
			() -> new WallBroomDustpanDisplayItem(PondersRoleplayModModBlocks.WALL_BROOM_DUSTPAN.get(), new Item.Properties().tab(PondersRoleplayModModTabs.TAB_PONDERS_ROLE_PLAY)));
	public static final RegistryObject<Item> TRASH_1 = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_1.getId().getPath(), () -> new Trash1DisplayItem(PondersRoleplayModModBlocks.TRASH_1.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_ITEM = REGISTRY.register("trash_item", () -> new TrashItemItem());
	public static final RegistryObject<Item> TRASH_2 = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_2.getId().getPath(), () -> new Trash2DisplayItem(PondersRoleplayModModBlocks.TRASH_2.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_3 = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_3.getId().getPath(), () -> new Trash3DisplayItem(PondersRoleplayModModBlocks.TRASH_3.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_4 = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_4.getId().getPath(), () -> new Trash4DisplayItem(PondersRoleplayModModBlocks.TRASH_4.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_5 = REGISTRY.register(PondersRoleplayModModBlocks.TRASH_5.getId().getPath(), () -> new Trash5DisplayItem(PondersRoleplayModModBlocks.TRASH_5.get(), new Item.Properties().tab(null)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
