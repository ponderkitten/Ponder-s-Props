
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

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
import net.mcreator.pondersroleplaymod.block.entity.SodaFillYellowTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillRedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillGreenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaFillBlueTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SodaDispensorTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.SinkTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PoopPuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.PeePuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MopandBucketTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.MopBucketTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.FullTrashBinTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainWaterTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainPoopTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainPeeTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.DrainBloodTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CashRegisterOpenTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.CashRegisterClosedTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.BloodPuddleTileEntity;
import net.mcreator.pondersroleplaymod.block.entity.BaggedTrashBinTileEntity;
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

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
