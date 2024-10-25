
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.pondersroleplaymod.block.entity.WrenchBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.WoodenBoards3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.WoodenBoards2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.WoodenBoards1TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.WaterPuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.WallBroomTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.WallBroomDustpanTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TrashbinStage2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TrashbinStage1TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TrashBinStage3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TrashBinEmptyTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TrashBagBoxOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TrashBagBoxClosedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Trash5TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Trash4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Trash3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Trash2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Trash1TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallWrenchTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallTapeTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallPowerDrillTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallPScrewdriverTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallMonkeyWrenchTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallHandSawTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallHammerTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallFScrewdriverTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallEmptyTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallCrowbarTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallBoxCutterTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ToolDrawerTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TapeBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TableTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TableLongTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TableLongMiddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TableAnd4ChairsTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.TableAnd2ChairsTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillYellowTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillRedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillGreenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillBlueTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaDispensorTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SkeeBallRampTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SkeeBallGoalTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SkeeBallBaseTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SinkTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PowerDrillBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PowerDrillBlockStandingTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Popcornmakertop1TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornmakerdrawerTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornmachineDrawerTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornMakerTop4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornMakerTop3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornMakerTop2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornMachineOilTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PopcornButterMachineTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PoopPuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PlatesTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates9TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates8TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates7TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates6TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates5TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates11TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.Plates10TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PickleJarOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PickleJarClosedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PhillipsHeadBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PepsiMachineTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PeePuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PaperOpenSignTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PaperClosedSignTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MopandBucketTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MopBucketTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MonkeyWrenchBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MetalFoldedUpChairTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MetalFoldedUpChairStackTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MetalFoldUpChairTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.IceCreamMachineTopTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.IceCreamMachineBottomTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.HomeDepotBoxOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.HomeDepotBoxClosedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.HandSawBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.HammerBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballmachineRedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballTowerRedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballTowerPinkTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballTowerGreenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballTowerBlueTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballMachinePinkTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballMachineGreenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.GumballMachineBlueTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FullTrashBinTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FrenchPress4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FrenchPress3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FrenchPress2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FrenchPress1TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FoldedUpTableTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FoldUpTableTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FoldUpTableCenteredTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FloorScrewsTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FlatHeadBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FlashlightBlockOnTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FlashlightBlockOffTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinBaglessTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinBaggedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.EmptyCupTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainWaterTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainPoopTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainPeeTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainBloodTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DeadKidBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CrowbarBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachineTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachine4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachine3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachine2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeMakerTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeMaker4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeMaker3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeMaker2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder4TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder3TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder2TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder1TileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeCupTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeBeanBagOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CoffeeBeanBagClosedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CocacolaMachineTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ClosedNoteTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ClawMachineTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ClawMachineSuccessTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ClawMachineFailTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ChangeMachineTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ChairTuckedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ChairTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CashRegisterOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CashRegisterClosedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CashRegisterCardTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.BoxCutterBlockTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.BloodPuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.BaggedTrashBinTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.ATMTileEntity;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

public class PondersRoleplayModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PondersRoleplayModMod.MODID);
	public static final RegistryObject<BlockEntityType<TrashbinStage1TileEntity>> TRASHBIN_STAGE_1 = REGISTRY.register("trashbin_stage_1",
			() -> BlockEntityType.Builder.of(TrashbinStage1TileEntity::new, PondersRoleplayModModBlocks.TRASHBIN_STAGE_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBinEmptyTileEntity>> TRASH_BIN_EMPTY = REGISTRY.register("trash_bin_empty",
			() -> BlockEntityType.Builder.of(TrashBinEmptyTileEntity::new, PondersRoleplayModModBlocks.TRASH_BIN_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashbinStage2TileEntity>> TRASHBIN_STAGE_2 = REGISTRY.register("trashbin_stage_2",
			() -> BlockEntityType.Builder.of(TrashbinStage2TileEntity::new, PondersRoleplayModModBlocks.TRASHBIN_STAGE_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBinStage3TileEntity>> TRASH_BIN_STAGE_3 = REGISTRY.register("trash_bin_stage_3",
			() -> BlockEntityType.Builder.of(TrashBinStage3TileEntity::new, PondersRoleplayModModBlocks.TRASH_BIN_STAGE_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<FullTrashBinTileEntity>> FULL_TRASH_BIN = REGISTRY.register("full_trash_bin",
			() -> BlockEntityType.Builder.of(FullTrashBinTileEntity::new, PondersRoleplayModModBlocks.FULL_TRASH_BIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<BaggedTrashBinTileEntity>> BAGGED_TRASH_BIN = REGISTRY.register("bagged_trash_bin",
			() -> BlockEntityType.Builder.of(BaggedTrashBinTileEntity::new, PondersRoleplayModModBlocks.BAGGED_TRASH_BIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<SodaDispensorTileEntity>> SODA_DISPENSOR = REGISTRY.register("soda_dispensor",
			() -> BlockEntityType.Builder.of(SodaDispensorTileEntity::new, PondersRoleplayModModBlocks.SODA_DISPENSOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<SodaFillRedTileEntity>> SODA_FILL_RED = REGISTRY.register("soda_fill_red",
			() -> BlockEntityType.Builder.of(SodaFillRedTileEntity::new, PondersRoleplayModModBlocks.SODA_FILL_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<SodaFillGreenTileEntity>> SODA_FILL_GREEN = REGISTRY.register("soda_fill_green",
			() -> BlockEntityType.Builder.of(SodaFillGreenTileEntity::new, PondersRoleplayModModBlocks.SODA_FILL_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<SodaFillBlueTileEntity>> SODA_FILL_BLUE = REGISTRY.register("soda_fill_blue",
			() -> BlockEntityType.Builder.of(SodaFillBlueTileEntity::new, PondersRoleplayModModBlocks.SODA_FILL_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SodaFillYellowTileEntity>> SODA_FILL_YELLOW = REGISTRY.register("soda_fill_yellow",
			() -> BlockEntityType.Builder.of(SodaFillYellowTileEntity::new, PondersRoleplayModModBlocks.SODA_FILL_YELLOW.get()).build(null));
	public static final RegistryObject<BlockEntityType<MopandBucketTileEntity>> MOPAND_BUCKET = REGISTRY.register("mopand_bucket",
			() -> BlockEntityType.Builder.of(MopandBucketTileEntity::new, PondersRoleplayModModBlocks.MOPAND_BUCKET.get()).build(null));
	public static final RegistryObject<BlockEntityType<MopBucketTileEntity>> MOP_BUCKET = REGISTRY.register("mop_bucket", () -> BlockEntityType.Builder.of(MopBucketTileEntity::new, PondersRoleplayModModBlocks.MOP_BUCKET.get()).build(null));
	public static final RegistryObject<BlockEntityType<WaterPuddleTileEntity>> WATER_PUDDLE = REGISTRY.register("water_puddle", () -> BlockEntityType.Builder.of(WaterPuddleTileEntity::new, PondersRoleplayModModBlocks.WATER_PUDDLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PeePuddleTileEntity>> PEE_PUDDLE = REGISTRY.register("pee_puddle", () -> BlockEntityType.Builder.of(PeePuddleTileEntity::new, PondersRoleplayModModBlocks.PEE_PUDDLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BloodPuddleTileEntity>> BLOOD_PUDDLE = REGISTRY.register("blood_puddle", () -> BlockEntityType.Builder.of(BloodPuddleTileEntity::new, PondersRoleplayModModBlocks.BLOOD_PUDDLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PoopPuddleTileEntity>> POOP_PUDDLE = REGISTRY.register("poop_puddle", () -> BlockEntityType.Builder.of(PoopPuddleTileEntity::new, PondersRoleplayModModBlocks.POOP_PUDDLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SinkTileEntity>> SINK = REGISTRY.register("sink", () -> BlockEntityType.Builder.of(SinkTileEntity::new, PondersRoleplayModModBlocks.SINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DrainTileEntity>> DRAIN = REGISTRY.register("drain", () -> BlockEntityType.Builder.of(DrainTileEntity::new, PondersRoleplayModModBlocks.DRAIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<DrainWaterTileEntity>> DRAIN_WATER = REGISTRY.register("drain_water", () -> BlockEntityType.Builder.of(DrainWaterTileEntity::new, PondersRoleplayModModBlocks.DRAIN_WATER.get()).build(null));
	public static final RegistryObject<BlockEntityType<DrainPeeTileEntity>> DRAIN_PEE = REGISTRY.register("drain_pee", () -> BlockEntityType.Builder.of(DrainPeeTileEntity::new, PondersRoleplayModModBlocks.DRAIN_PEE.get()).build(null));
	public static final RegistryObject<BlockEntityType<DrainBloodTileEntity>> DRAIN_BLOOD = REGISTRY.register("drain_blood", () -> BlockEntityType.Builder.of(DrainBloodTileEntity::new, PondersRoleplayModModBlocks.DRAIN_BLOOD.get()).build(null));
	public static final RegistryObject<BlockEntityType<DrainPoopTileEntity>> DRAIN_POOP = REGISTRY.register("drain_poop", () -> BlockEntityType.Builder.of(DrainPoopTileEntity::new, PondersRoleplayModModBlocks.DRAIN_POOP.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBagBoxClosedTileEntity>> TRASH_BAG_BOX_CLOSED = REGISTRY.register("trash_bag_box_closed",
			() -> BlockEntityType.Builder.of(TrashBagBoxClosedTileEntity::new, PondersRoleplayModModBlocks.TRASH_BAG_BOX_CLOSED.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBagBoxOpenTileEntity>> TRASH_BAG_BOX_OPEN = REGISTRY.register("trash_bag_box_open",
			() -> BlockEntityType.Builder.of(TrashBagBoxOpenTileEntity::new, PondersRoleplayModModBlocks.TRASH_BAG_BOX_OPEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<CashRegisterClosedTileEntity>> CASH_REGISTER_CLOSED = REGISTRY.register("cash_register_closed",
			() -> BlockEntityType.Builder.of(CashRegisterClosedTileEntity::new, PondersRoleplayModModBlocks.CASH_REGISTER_CLOSED.get()).build(null));
	public static final RegistryObject<BlockEntityType<CashRegisterOpenTileEntity>> CASH_REGISTER_OPEN = REGISTRY.register("cash_register_open",
			() -> BlockEntityType.Builder.of(CashRegisterOpenTileEntity::new, PondersRoleplayModModBlocks.CASH_REGISTER_OPEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<WallBroomTileEntity>> WALL_BROOM = REGISTRY.register("wall_broom", () -> BlockEntityType.Builder.of(WallBroomTileEntity::new, PondersRoleplayModModBlocks.WALL_BROOM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WallBroomDustpanTileEntity>> WALL_BROOM_DUSTPAN = REGISTRY.register("wall_broom_dustpan",
			() -> BlockEntityType.Builder.of(WallBroomDustpanTileEntity::new, PondersRoleplayModModBlocks.WALL_BROOM_DUSTPAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<Trash1TileEntity>> TRASH_1 = REGISTRY.register("trash_1", () -> BlockEntityType.Builder.of(Trash1TileEntity::new, PondersRoleplayModModBlocks.TRASH_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<Trash2TileEntity>> TRASH_2 = REGISTRY.register("trash_2", () -> BlockEntityType.Builder.of(Trash2TileEntity::new, PondersRoleplayModModBlocks.TRASH_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<Trash3TileEntity>> TRASH_3 = REGISTRY.register("trash_3", () -> BlockEntityType.Builder.of(Trash3TileEntity::new, PondersRoleplayModModBlocks.TRASH_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<Trash4TileEntity>> TRASH_4 = REGISTRY.register("trash_4", () -> BlockEntityType.Builder.of(Trash4TileEntity::new, PondersRoleplayModModBlocks.TRASH_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<Trash5TileEntity>> TRASH_5 = REGISTRY.register("trash_5", () -> BlockEntityType.Builder.of(Trash5TileEntity::new, PondersRoleplayModModBlocks.TRASH_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenBoards3TileEntity>> WOODEN_BOARDS_3 = REGISTRY.register("wooden_boards_3",
			() -> BlockEntityType.Builder.of(WoodenBoards3TileEntity::new, PondersRoleplayModModBlocks.WOODEN_BOARDS_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenBoards2TileEntity>> WOODEN_BOARDS_2 = REGISTRY.register("wooden_boards_2",
			() -> BlockEntityType.Builder.of(WoodenBoards2TileEntity::new, PondersRoleplayModModBlocks.WOODEN_BOARDS_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenBoards1TileEntity>> WOODEN_BOARDS_1 = REGISTRY.register("wooden_boards_1",
			() -> BlockEntityType.Builder.of(WoodenBoards1TileEntity::new, PondersRoleplayModModBlocks.WOODEN_BOARDS_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClosedNoteTileEntity>> CLOSED_NOTE = REGISTRY.register("closed_note", () -> BlockEntityType.Builder.of(ClosedNoteTileEntity::new, PondersRoleplayModModBlocks.CLOSED_NOTE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PaperOpenSignTileEntity>> PAPER_OPEN_SIGN = REGISTRY.register("paper_open_sign",
			() -> BlockEntityType.Builder.of(PaperOpenSignTileEntity::new, PondersRoleplayModModBlocks.PAPER_OPEN_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<PaperClosedSignTileEntity>> PAPER_CLOSED_SIGN = REGISTRY.register("paper_closed_sign",
			() -> BlockEntityType.Builder.of(PaperClosedSignTileEntity::new, PondersRoleplayModModBlocks.PAPER_CLOSED_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<PlatesTileEntity>> PLATES = REGISTRY.register("plates", () -> BlockEntityType.Builder.of(PlatesTileEntity::new, PondersRoleplayModModBlocks.PLATES.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates2TileEntity>> PLATES_2 = REGISTRY.register("plates_2", () -> BlockEntityType.Builder.of(Plates2TileEntity::new, PondersRoleplayModModBlocks.PLATES_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates3TileEntity>> PLATES_3 = REGISTRY.register("plates_3", () -> BlockEntityType.Builder.of(Plates3TileEntity::new, PondersRoleplayModModBlocks.PLATES_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates4TileEntity>> PLATES_4 = REGISTRY.register("plates_4", () -> BlockEntityType.Builder.of(Plates4TileEntity::new, PondersRoleplayModModBlocks.PLATES_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates5TileEntity>> PLATES_5 = REGISTRY.register("plates_5", () -> BlockEntityType.Builder.of(Plates5TileEntity::new, PondersRoleplayModModBlocks.PLATES_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates6TileEntity>> PLATES_6 = REGISTRY.register("plates_6", () -> BlockEntityType.Builder.of(Plates6TileEntity::new, PondersRoleplayModModBlocks.PLATES_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates7TileEntity>> PLATES_7 = REGISTRY.register("plates_7", () -> BlockEntityType.Builder.of(Plates7TileEntity::new, PondersRoleplayModModBlocks.PLATES_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates8TileEntity>> PLATES_8 = REGISTRY.register("plates_8", () -> BlockEntityType.Builder.of(Plates8TileEntity::new, PondersRoleplayModModBlocks.PLATES_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates9TileEntity>> PLATES_9 = REGISTRY.register("plates_9", () -> BlockEntityType.Builder.of(Plates9TileEntity::new, PondersRoleplayModModBlocks.PLATES_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates10TileEntity>> PLATES_10 = REGISTRY.register("plates_10", () -> BlockEntityType.Builder.of(Plates10TileEntity::new, PondersRoleplayModModBlocks.PLATES_10.get()).build(null));
	public static final RegistryObject<BlockEntityType<Plates11TileEntity>> PLATES_11 = REGISTRY.register("plates_11", () -> BlockEntityType.Builder.of(Plates11TileEntity::new, PondersRoleplayModModBlocks.PLATES_11.get()).build(null));
	public static final RegistryObject<BlockEntityType<HomeDepotBoxOpenTileEntity>> HOME_DEPOT_BOX_OPEN = REGISTRY.register("home_depot_box_open",
			() -> BlockEntityType.Builder.of(HomeDepotBoxOpenTileEntity::new, PondersRoleplayModModBlocks.HOME_DEPOT_BOX_OPEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<HomeDepotBoxClosedTileEntity>> HOME_DEPOT_BOX_CLOSED = REGISTRY.register("home_depot_box_closed",
			() -> BlockEntityType.Builder.of(HomeDepotBoxClosedTileEntity::new, PondersRoleplayModModBlocks.HOME_DEPOT_BOX_CLOSED.get()).build(null));
	public static final RegistryObject<BlockEntityType<PickleJarClosedTileEntity>> PICKLE_JAR_CLOSED = REGISTRY.register("pickle_jar_closed",
			() -> BlockEntityType.Builder.of(PickleJarClosedTileEntity::new, PondersRoleplayModModBlocks.PICKLE_JAR_CLOSED.get()).build(null));
	public static final RegistryObject<BlockEntityType<PickleJarOpenTileEntity>> PICKLE_JAR_OPEN = REGISTRY.register("pickle_jar_open",
			() -> BlockEntityType.Builder.of(PickleJarOpenTileEntity::new, PondersRoleplayModModBlocks.PICKLE_JAR_OPEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<TableAnd2ChairsTileEntity>> TABLE_AND_2_CHAIRS = REGISTRY.register("table_and_2_chairs",
			() -> BlockEntityType.Builder.of(TableAnd2ChairsTileEntity::new, PondersRoleplayModModBlocks.TABLE_AND_2_CHAIRS.get()).build(null));
	public static final RegistryObject<BlockEntityType<EnclosedTrashBinTileEntity>> ENCLOSED_TRASH_BIN = REGISTRY.register("enclosed_trash_bin",
			() -> BlockEntityType.Builder.of(EnclosedTrashBinTileEntity::new, PondersRoleplayModModBlocks.ENCLOSED_TRASH_BIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<EnclosedTrashBinOpenTileEntity>> ENCLOSED_TRASH_BIN_OPEN = REGISTRY.register("enclosed_trash_bin_open",
			() -> BlockEntityType.Builder.of(EnclosedTrashBinOpenTileEntity::new, PondersRoleplayModModBlocks.ENCLOSED_TRASH_BIN_OPEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<EnclosedTrashBinBaglessTileEntity>> ENCLOSED_TRASH_BIN_BAGLESS = REGISTRY.register("enclosed_trash_bin_bagless",
			() -> BlockEntityType.Builder.of(EnclosedTrashBinBaglessTileEntity::new, PondersRoleplayModModBlocks.ENCLOSED_TRASH_BIN_BAGLESS.get()).build(null));
	public static final RegistryObject<BlockEntityType<EnclosedTrashBinBaggedTileEntity>> ENCLOSED_TRASH_BIN_BAGGED = REGISTRY.register("enclosed_trash_bin_bagged",
			() -> BlockEntityType.Builder.of(EnclosedTrashBinBaggedTileEntity::new, PondersRoleplayModModBlocks.ENCLOSED_TRASH_BIN_BAGGED.get()).build(null));
	public static final RegistryObject<BlockEntityType<TableAnd4ChairsTileEntity>> TABLE_AND_4_CHAIRS = REGISTRY.register("table_and_4_chairs",
			() -> BlockEntityType.Builder.of(TableAnd4ChairsTileEntity::new, PondersRoleplayModModBlocks.TABLE_AND_4_CHAIRS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChairTileEntity>> CHAIR = REGISTRY.register("chair", () -> BlockEntityType.Builder.of(ChairTileEntity::new, PondersRoleplayModModBlocks.CHAIR.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChairTuckedTileEntity>> CHAIR_TUCKED = REGISTRY.register("chair_tucked", () -> BlockEntityType.Builder.of(ChairTuckedTileEntity::new, PondersRoleplayModModBlocks.CHAIR_TUCKED.get()).build(null));
	public static final RegistryObject<BlockEntityType<TableTileEntity>> TABLE = REGISTRY.register("table", () -> BlockEntityType.Builder.of(TableTileEntity::new, PondersRoleplayModModBlocks.TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<TableLongTileEntity>> TABLE_LONG = REGISTRY.register("table_long", () -> BlockEntityType.Builder.of(TableLongTileEntity::new, PondersRoleplayModModBlocks.TABLE_LONG.get()).build(null));
	public static final RegistryObject<BlockEntityType<TableLongMiddleTileEntity>> TABLE_LONG_MIDDLE = REGISTRY.register("table_long_middle",
			() -> BlockEntityType.Builder.of(TableLongMiddleTileEntity::new, PondersRoleplayModModBlocks.TABLE_LONG_MIDDLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<MetalFoldUpChairTileEntity>> METAL_FOLD_UP_CHAIR = REGISTRY.register("metal_fold_up_chair",
			() -> BlockEntityType.Builder.of(MetalFoldUpChairTileEntity::new, PondersRoleplayModModBlocks.METAL_FOLD_UP_CHAIR.get()).build(null));
	public static final RegistryObject<BlockEntityType<MetalFoldedUpChairTileEntity>> METAL_FOLDED_UP_CHAIR = REGISTRY.register("metal_folded_up_chair",
			() -> BlockEntityType.Builder.of(MetalFoldedUpChairTileEntity::new, PondersRoleplayModModBlocks.METAL_FOLDED_UP_CHAIR.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoldUpTableTileEntity>> FOLD_UP_TABLE = REGISTRY.register("fold_up_table",
			() -> BlockEntityType.Builder.of(FoldUpTableTileEntity::new, PondersRoleplayModModBlocks.FOLD_UP_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoldUpTableCenteredTileEntity>> FOLD_UP_TABLE_CENTERED = REGISTRY.register("fold_up_table_centered",
			() -> BlockEntityType.Builder.of(FoldUpTableCenteredTileEntity::new, PondersRoleplayModModBlocks.FOLD_UP_TABLE_CENTERED.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoldedUpTableTileEntity>> FOLDED_UP_TABLE = REGISTRY.register("folded_up_table",
			() -> BlockEntityType.Builder.of(FoldedUpTableTileEntity::new, PondersRoleplayModModBlocks.FOLDED_UP_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CashRegisterCardTileEntity>> CASH_REGISTER_CARD = REGISTRY.register("cash_register_card",
			() -> BlockEntityType.Builder.of(CashRegisterCardTileEntity::new, PondersRoleplayModModBlocks.CASH_REGISTER_CARD.get()).build(null));
	public static final RegistryObject<BlockEntityType<MetalFoldedUpChairStackTileEntity>> METAL_FOLDED_UP_CHAIR_STACK = REGISTRY.register("metal_folded_up_chair_stack",
			() -> BlockEntityType.Builder.of(MetalFoldedUpChairStackTileEntity::new, PondersRoleplayModModBlocks.METAL_FOLDED_UP_CHAIR_STACK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeMakerTileEntity>> COFFEE_MAKER = REGISTRY.register("coffee_maker", () -> BlockEntityType.Builder.of(CoffeeMakerTileEntity::new, PondersRoleplayModModBlocks.COFFEE_MAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeMaker2TileEntity>> COFFEE_MAKER_2 = REGISTRY.register("coffee_maker_2",
			() -> BlockEntityType.Builder.of(CoffeeMaker2TileEntity::new, PondersRoleplayModModBlocks.COFFEE_MAKER_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeMaker3TileEntity>> COFFEE_MAKER_3 = REGISTRY.register("coffee_maker_3",
			() -> BlockEntityType.Builder.of(CoffeeMaker3TileEntity::new, PondersRoleplayModModBlocks.COFFEE_MAKER_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeMaker4TileEntity>> COFFEE_MAKER_4 = REGISTRY.register("coffee_maker_4",
			() -> BlockEntityType.Builder.of(CoffeeMaker4TileEntity::new, PondersRoleplayModModBlocks.COFFEE_MAKER_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeCupTileEntity>> COFFEE_CUP = REGISTRY.register("coffee_cup", () -> BlockEntityType.Builder.of(CoffeeCupTileEntity::new, PondersRoleplayModModBlocks.COFFEE_CUP.get()).build(null));
	public static final RegistryObject<BlockEntityType<EmptyCupTileEntity>> EMPTY_CUP = REGISTRY.register("empty_cup", () -> BlockEntityType.Builder.of(EmptyCupTileEntity::new, PondersRoleplayModModBlocks.EMPTY_CUP.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeePotMachineTileEntity>> COFFEE_POT_MACHINE = REGISTRY.register("coffee_pot_machine",
			() -> BlockEntityType.Builder.of(CoffeePotMachineTileEntity::new, PondersRoleplayModModBlocks.COFFEE_POT_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeePotMachine2TileEntity>> COFFEE_POT_MACHINE_2 = REGISTRY.register("coffee_pot_machine_2",
			() -> BlockEntityType.Builder.of(CoffeePotMachine2TileEntity::new, PondersRoleplayModModBlocks.COFFEE_POT_MACHINE_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeePotMachine3TileEntity>> COFFEE_POT_MACHINE_3 = REGISTRY.register("coffee_pot_machine_3",
			() -> BlockEntityType.Builder.of(CoffeePotMachine3TileEntity::new, PondersRoleplayModModBlocks.COFFEE_POT_MACHINE_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeePotMachine4TileEntity>> COFFEE_POT_MACHINE_4 = REGISTRY.register("coffee_pot_machine_4",
			() -> BlockEntityType.Builder.of(CoffeePotMachine4TileEntity::new, PondersRoleplayModModBlocks.COFFEE_POT_MACHINE_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeBeanBagClosedTileEntity>> COFFEE_BEAN_BAG_CLOSED = REGISTRY.register("coffee_bean_bag_closed",
			() -> BlockEntityType.Builder.of(CoffeeBeanBagClosedTileEntity::new, PondersRoleplayModModBlocks.COFFEE_BEAN_BAG_CLOSED.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeBeanBagOpenTileEntity>> COFFEE_BEAN_BAG_OPEN = REGISTRY.register("coffee_bean_bag_open",
			() -> BlockEntityType.Builder.of(CoffeeBeanBagOpenTileEntity::new, PondersRoleplayModModBlocks.COFFEE_BEAN_BAG_OPEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeGrinder1TileEntity>> COFFEE_GRINDER_1 = REGISTRY.register("coffee_grinder_1",
			() -> BlockEntityType.Builder.of(CoffeeGrinder1TileEntity::new, PondersRoleplayModModBlocks.COFFEE_GRINDER_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeGrinder2TileEntity>> COFFEE_GRINDER_2 = REGISTRY.register("coffee_grinder_2",
			() -> BlockEntityType.Builder.of(CoffeeGrinder2TileEntity::new, PondersRoleplayModModBlocks.COFFEE_GRINDER_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeGrinder3TileEntity>> COFFEE_GRINDER_3 = REGISTRY.register("coffee_grinder_3",
			() -> BlockEntityType.Builder.of(CoffeeGrinder3TileEntity::new, PondersRoleplayModModBlocks.COFFEE_GRINDER_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffeeGrinder4TileEntity>> COFFEE_GRINDER_4 = REGISTRY.register("coffee_grinder_4",
			() -> BlockEntityType.Builder.of(CoffeeGrinder4TileEntity::new, PondersRoleplayModModBlocks.COFFEE_GRINDER_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<FrenchPress1TileEntity>> FRENCH_PRESS_1 = REGISTRY.register("french_press_1",
			() -> BlockEntityType.Builder.of(FrenchPress1TileEntity::new, PondersRoleplayModModBlocks.FRENCH_PRESS_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<FrenchPress2TileEntity>> FRENCH_PRESS_2 = REGISTRY.register("french_press_2",
			() -> BlockEntityType.Builder.of(FrenchPress2TileEntity::new, PondersRoleplayModModBlocks.FRENCH_PRESS_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<FrenchPress3TileEntity>> FRENCH_PRESS_3 = REGISTRY.register("french_press_3",
			() -> BlockEntityType.Builder.of(FrenchPress3TileEntity::new, PondersRoleplayModModBlocks.FRENCH_PRESS_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<FrenchPress4TileEntity>> FRENCH_PRESS_4 = REGISTRY.register("french_press_4",
			() -> BlockEntityType.Builder.of(FrenchPress4TileEntity::new, PondersRoleplayModModBlocks.FRENCH_PRESS_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<Popcornmakertop1TileEntity>> POPCORNMAKERTOP_1 = REGISTRY.register("popcornmakertop_1",
			() -> BlockEntityType.Builder.of(Popcornmakertop1TileEntity::new, PondersRoleplayModModBlocks.POPCORNMAKERTOP_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornMakerTop2TileEntity>> POPCORN_MAKER_TOP_2 = REGISTRY.register("popcorn_maker_top_2",
			() -> BlockEntityType.Builder.of(PopcornMakerTop2TileEntity::new, PondersRoleplayModModBlocks.POPCORN_MAKER_TOP_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornMakerTop3TileEntity>> POPCORN_MAKER_TOP_3 = REGISTRY.register("popcorn_maker_top_3",
			() -> BlockEntityType.Builder.of(PopcornMakerTop3TileEntity::new, PondersRoleplayModModBlocks.POPCORN_MAKER_TOP_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornMakerTop4TileEntity>> POPCORN_MAKER_TOP_4 = REGISTRY.register("popcorn_maker_top_4",
			() -> BlockEntityType.Builder.of(PopcornMakerTop4TileEntity::new, PondersRoleplayModModBlocks.POPCORN_MAKER_TOP_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornmakerdrawerTileEntity>> POPCORNMAKERDRAWER = REGISTRY.register("popcornmakerdrawer",
			() -> BlockEntityType.Builder.of(PopcornmakerdrawerTileEntity::new, PondersRoleplayModModBlocks.POPCORNMAKERDRAWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornmachineDrawerTileEntity>> POPCORNMACHINE_DRAWER = REGISTRY.register("popcornmachine_drawer",
			() -> BlockEntityType.Builder.of(PopcornmachineDrawerTileEntity::new, PondersRoleplayModModBlocks.POPCORNMACHINE_DRAWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornMachineOilTileEntity>> POPCORN_MACHINE_OIL = REGISTRY.register("popcorn_machine_oil",
			() -> BlockEntityType.Builder.of(PopcornMachineOilTileEntity::new, PondersRoleplayModModBlocks.POPCORN_MACHINE_OIL.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopcornButterMachineTileEntity>> POPCORN_BUTTER_MACHINE = REGISTRY.register("popcorn_butter_machine",
			() -> BlockEntityType.Builder.of(PopcornButterMachineTileEntity::new, PondersRoleplayModModBlocks.POPCORN_BUTTER_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ATMTileEntity>> ATM = REGISTRY.register("atm", () -> BlockEntityType.Builder.of(ATMTileEntity::new, PondersRoleplayModModBlocks.ATM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChangeMachineTileEntity>> CHANGE_MACHINE = REGISTRY.register("change_machine",
			() -> BlockEntityType.Builder.of(ChangeMachineTileEntity::new, PondersRoleplayModModBlocks.CHANGE_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClawMachineTileEntity>> CLAW_MACHINE = REGISTRY.register("claw_machine", () -> BlockEntityType.Builder.of(ClawMachineTileEntity::new, PondersRoleplayModModBlocks.CLAW_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClawMachineSuccessTileEntity>> CLAW_MACHINE_SUCCESS = REGISTRY.register("claw_machine_success",
			() -> BlockEntityType.Builder.of(ClawMachineSuccessTileEntity::new, PondersRoleplayModModBlocks.CLAW_MACHINE_SUCCESS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClawMachineFailTileEntity>> CLAW_MACHINE_FAIL = REGISTRY.register("claw_machine_fail",
			() -> BlockEntityType.Builder.of(ClawMachineFailTileEntity::new, PondersRoleplayModModBlocks.CLAW_MACHINE_FAIL.get()).build(null));
	public static final RegistryObject<BlockEntityType<SkeeBallBaseTileEntity>> SKEE_BALL_BASE = REGISTRY.register("skee_ball_base",
			() -> BlockEntityType.Builder.of(SkeeBallBaseTileEntity::new, PondersRoleplayModModBlocks.SKEE_BALL_BASE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SkeeBallRampTileEntity>> SKEE_BALL_RAMP = REGISTRY.register("skee_ball_ramp",
			() -> BlockEntityType.Builder.of(SkeeBallRampTileEntity::new, PondersRoleplayModModBlocks.SKEE_BALL_RAMP.get()).build(null));
	public static final RegistryObject<BlockEntityType<SkeeBallGoalTileEntity>> SKEE_BALL_GOAL = REGISTRY.register("skee_ball_goal",
			() -> BlockEntityType.Builder.of(SkeeBallGoalTileEntity::new, PondersRoleplayModModBlocks.SKEE_BALL_GOAL.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballmachineRedTileEntity>> GUMBALLMACHINE_RED = REGISTRY.register("gumballmachine_red",
			() -> BlockEntityType.Builder.of(GumballmachineRedTileEntity::new, PondersRoleplayModModBlocks.GUMBALLMACHINE_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballMachineBlueTileEntity>> GUMBALL_MACHINE_BLUE = REGISTRY.register("gumball_machine_blue",
			() -> BlockEntityType.Builder.of(GumballMachineBlueTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_MACHINE_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballMachineGreenTileEntity>> GUMBALL_MACHINE_GREEN = REGISTRY.register("gumball_machine_green",
			() -> BlockEntityType.Builder.of(GumballMachineGreenTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_MACHINE_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballMachinePinkTileEntity>> GUMBALL_MACHINE_PINK = REGISTRY.register("gumball_machine_pink",
			() -> BlockEntityType.Builder.of(GumballMachinePinkTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_MACHINE_PINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballTowerRedTileEntity>> GUMBALL_TOWER_RED = REGISTRY.register("gumball_tower_red",
			() -> BlockEntityType.Builder.of(GumballTowerRedTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_TOWER_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballTowerBlueTileEntity>> GUMBALL_TOWER_BLUE = REGISTRY.register("gumball_tower_blue",
			() -> BlockEntityType.Builder.of(GumballTowerBlueTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_TOWER_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballTowerGreenTileEntity>> GUMBALL_TOWER_GREEN = REGISTRY.register("gumball_tower_green",
			() -> BlockEntityType.Builder.of(GumballTowerGreenTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_TOWER_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<GumballTowerPinkTileEntity>> GUMBALL_TOWER_PINK = REGISTRY.register("gumball_tower_pink",
			() -> BlockEntityType.Builder.of(GumballTowerPinkTileEntity::new, PondersRoleplayModModBlocks.GUMBALL_TOWER_PINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PepsiMachineTileEntity>> PEPSI_MACHINE = REGISTRY.register("pepsi_machine",
			() -> BlockEntityType.Builder.of(PepsiMachineTileEntity::new, PondersRoleplayModModBlocks.PEPSI_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CocacolaMachineTileEntity>> COCACOLA_MACHINE = REGISTRY.register("cocacola_machine",
			() -> BlockEntityType.Builder.of(CocacolaMachineTileEntity::new, PondersRoleplayModModBlocks.COCACOLA_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<IceCreamMachineBottomTileEntity>> ICE_CREAM_MACHINE_BOTTOM = REGISTRY.register("ice_cream_machine_bottom",
			() -> BlockEntityType.Builder.of(IceCreamMachineBottomTileEntity::new, PondersRoleplayModModBlocks.ICE_CREAM_MACHINE_BOTTOM.get()).build(null));
	public static final RegistryObject<BlockEntityType<IceCreamMachineTopTileEntity>> ICE_CREAM_MACHINE_TOP = REGISTRY.register("ice_cream_machine_top",
			() -> BlockEntityType.Builder.of(IceCreamMachineTopTileEntity::new, PondersRoleplayModModBlocks.ICE_CREAM_MACHINE_TOP.get()).build(null));
	public static final RegistryObject<BlockEntityType<HammerBlockTileEntity>> HAMMER_BLOCK = REGISTRY.register("hammer_block", () -> BlockEntityType.Builder.of(HammerBlockTileEntity::new, PondersRoleplayModModBlocks.HAMMER_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CrowbarBlockTileEntity>> CROWBAR_BLOCK = REGISTRY.register("crowbar_block",
			() -> BlockEntityType.Builder.of(CrowbarBlockTileEntity::new, PondersRoleplayModModBlocks.CROWBAR_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxCutterBlockTileEntity>> BOX_CUTTER_BLOCK = REGISTRY.register("box_cutter_block",
			() -> BlockEntityType.Builder.of(BoxCutterBlockTileEntity::new, PondersRoleplayModModBlocks.BOX_CUTTER_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<HandSawBlockTileEntity>> HAND_SAW_BLOCK = REGISTRY.register("hand_saw_block",
			() -> BlockEntityType.Builder.of(HandSawBlockTileEntity::new, PondersRoleplayModModBlocks.HAND_SAW_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MonkeyWrenchBlockTileEntity>> MONKEY_WRENCH_BLOCK = REGISTRY.register("monkey_wrench_block",
			() -> BlockEntityType.Builder.of(MonkeyWrenchBlockTileEntity::new, PondersRoleplayModModBlocks.MONKEY_WRENCH_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PowerDrillBlockTileEntity>> POWER_DRILL_BLOCK = REGISTRY.register("power_drill_block",
			() -> BlockEntityType.Builder.of(PowerDrillBlockTileEntity::new, PondersRoleplayModModBlocks.POWER_DRILL_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PowerDrillBlockStandingTileEntity>> POWER_DRILL_BLOCK_STANDING = REGISTRY.register("power_drill_block_standing",
			() -> BlockEntityType.Builder.of(PowerDrillBlockStandingTileEntity::new, PondersRoleplayModModBlocks.POWER_DRILL_BLOCK_STANDING.get()).build(null));
	public static final RegistryObject<BlockEntityType<WrenchBlockTileEntity>> WRENCH_BLOCK = REGISTRY.register("wrench_block", () -> BlockEntityType.Builder.of(WrenchBlockTileEntity::new, PondersRoleplayModModBlocks.WRENCH_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<TapeBlockTileEntity>> TAPE_BLOCK = REGISTRY.register("tape_block", () -> BlockEntityType.Builder.of(TapeBlockTileEntity::new, PondersRoleplayModModBlocks.TAPE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FlatHeadBlockTileEntity>> FLAT_HEAD_BLOCK = REGISTRY.register("flat_head_block",
			() -> BlockEntityType.Builder.of(FlatHeadBlockTileEntity::new, PondersRoleplayModModBlocks.FLAT_HEAD_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PhillipsHeadBlockTileEntity>> PHILLIPS_HEAD_BLOCK = REGISTRY.register("phillips_head_block",
			() -> BlockEntityType.Builder.of(PhillipsHeadBlockTileEntity::new, PondersRoleplayModModBlocks.PHILLIPS_HEAD_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FlashlightBlockOnTileEntity>> FLASHLIGHT_BLOCK_ON = REGISTRY.register("flashlight_block_on",
			() -> BlockEntityType.Builder.of(FlashlightBlockOnTileEntity::new, PondersRoleplayModModBlocks.FLASHLIGHT_BLOCK_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<FlashlightBlockOffTileEntity>> FLASHLIGHT_BLOCK_OFF = REGISTRY.register("flashlight_block_off",
			() -> BlockEntityType.Builder.of(FlashlightBlockOffTileEntity::new, PondersRoleplayModModBlocks.FLASHLIGHT_BLOCK_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<FloorScrewsTileEntity>> FLOOR_SCREWS = REGISTRY.register("floor_screws", () -> BlockEntityType.Builder.of(FloorScrewsTileEntity::new, PondersRoleplayModModBlocks.FLOOR_SCREWS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolDrawerTileEntity>> TOOL_DRAWER = REGISTRY.register("tool_drawer", () -> BlockEntityType.Builder.of(ToolDrawerTileEntity::new, PondersRoleplayModModBlocks.TOOL_DRAWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallEmptyTileEntity>> TOOL_WALL_EMPTY = REGISTRY.register("tool_wall_empty",
			() -> BlockEntityType.Builder.of(ToolWallEmptyTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallHammerTileEntity>> TOOL_WALL_HAMMER = REGISTRY.register("tool_wall_hammer",
			() -> BlockEntityType.Builder.of(ToolWallHammerTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_HAMMER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallTapeTileEntity>> TOOL_WALL_TAPE = REGISTRY.register("tool_wall_tape",
			() -> BlockEntityType.Builder.of(ToolWallTapeTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_TAPE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallBoxCutterTileEntity>> TOOL_WALL_BOX_CUTTER = REGISTRY.register("tool_wall_box_cutter",
			() -> BlockEntityType.Builder.of(ToolWallBoxCutterTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_BOX_CUTTER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallCrowbarTileEntity>> TOOL_WALL_CROWBAR = REGISTRY.register("tool_wall_crowbar",
			() -> BlockEntityType.Builder.of(ToolWallCrowbarTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_CROWBAR.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallHandSawTileEntity>> TOOL_WALL_HAND_SAW = REGISTRY.register("tool_wall_hand_saw",
			() -> BlockEntityType.Builder.of(ToolWallHandSawTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_HAND_SAW.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallMonkeyWrenchTileEntity>> TOOL_WALL_MONKEY_WRENCH = REGISTRY.register("tool_wall_monkey_wrench",
			() -> BlockEntityType.Builder.of(ToolWallMonkeyWrenchTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_MONKEY_WRENCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallWrenchTileEntity>> TOOL_WALL_WRENCH = REGISTRY.register("tool_wall_wrench",
			() -> BlockEntityType.Builder.of(ToolWallWrenchTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_WRENCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallPowerDrillTileEntity>> TOOL_WALL_POWER_DRILL = REGISTRY.register("tool_wall_power_drill",
			() -> BlockEntityType.Builder.of(ToolWallPowerDrillTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_POWER_DRILL.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallPScrewdriverTileEntity>> TOOL_WALL_P_SCREWDRIVER = REGISTRY.register("tool_wall_p_screwdriver",
			() -> BlockEntityType.Builder.of(ToolWallPScrewdriverTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_P_SCREWDRIVER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolWallFScrewdriverTileEntity>> TOOL_WALL_F_SCREWDRIVER = REGISTRY.register("tool_wall_f_screwdriver",
			() -> BlockEntityType.Builder.of(ToolWallFScrewdriverTileEntity::new, PondersRoleplayModModBlocks.TOOL_WALL_F_SCREWDRIVER.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeadKidBlockTileEntity>> DEAD_KID_BLOCK = REGISTRY.register("dead_kid_block",
			() -> BlockEntityType.Builder.of(DeadKidBlockTileEntity::new, PondersRoleplayModModBlocks.DEAD_KID_BLOCK.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
