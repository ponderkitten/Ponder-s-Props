
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.pondersroleplaymod.block.WaterPuddleBlock;
import net.mcreator.pondersroleplaymod.block.TrashbinStage2Block;
import net.mcreator.pondersroleplaymod.block.TrashbinStage1Block;
import net.mcreator.pondersroleplaymod.block.TrashBinStage3Block;
import net.mcreator.pondersroleplaymod.block.TrashBinEmptyBlock;
import net.mcreator.pondersroleplaymod.block.TrashBagBoxOpenBlock;
import net.mcreator.pondersroleplaymod.block.TrashBagBoxClosedBlock;
import net.mcreator.pondersroleplaymod.block.SodaFillYellowBlock;
import net.mcreator.pondersroleplaymod.block.SodaFillRedBlock;
import net.mcreator.pondersroleplaymod.block.SodaFillGreenBlock;
import net.mcreator.pondersroleplaymod.block.SodaFillBlueBlock;
import net.mcreator.pondersroleplaymod.block.SodaDispensorBlock;
import net.mcreator.pondersroleplaymod.block.SinkBlock;
import net.mcreator.pondersroleplaymod.block.ShadowBlock;
import net.mcreator.pondersroleplaymod.block.PoopPuddleBlock;
import net.mcreator.pondersroleplaymod.block.PeePuddleBlock;
import net.mcreator.pondersroleplaymod.block.MopandBucketBlock;
import net.mcreator.pondersroleplaymod.block.MopBucketBlock;
import net.mcreator.pondersroleplaymod.block.FullTrashBinBlock;
import net.mcreator.pondersroleplaymod.block.DrainWaterBlock;
import net.mcreator.pondersroleplaymod.block.DrainPoopBlock;
import net.mcreator.pondersroleplaymod.block.DrainPeeBlock;
import net.mcreator.pondersroleplaymod.block.DrainBloodBlock;
import net.mcreator.pondersroleplaymod.block.DrainBlock;
import net.mcreator.pondersroleplaymod.block.CashRegisterOpenBlock;
import net.mcreator.pondersroleplaymod.block.CashRegisterClosedBlock;
import net.mcreator.pondersroleplaymod.block.BloodPuddleBlock;
import net.mcreator.pondersroleplaymod.block.BaggedTrashBinBlock;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

public class PondersRoleplayModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PondersRoleplayModMod.MODID);
	public static final RegistryObject<Block> TRASHBIN_STAGE_1 = REGISTRY.register("trashbin_stage_1", () -> new TrashbinStage1Block());
	public static final RegistryObject<Block> TRASH_BIN_EMPTY = REGISTRY.register("trash_bin_empty", () -> new TrashBinEmptyBlock());
	public static final RegistryObject<Block> TRASHBIN_STAGE_2 = REGISTRY.register("trashbin_stage_2", () -> new TrashbinStage2Block());
	public static final RegistryObject<Block> TRASH_BIN_STAGE_3 = REGISTRY.register("trash_bin_stage_3", () -> new TrashBinStage3Block());
	public static final RegistryObject<Block> FULL_TRASH_BIN = REGISTRY.register("full_trash_bin", () -> new FullTrashBinBlock());
	public static final RegistryObject<Block> BAGGED_TRASH_BIN = REGISTRY.register("bagged_trash_bin", () -> new BaggedTrashBinBlock());
	public static final RegistryObject<Block> SODA_DISPENSOR = REGISTRY.register("soda_dispensor", () -> new SodaDispensorBlock());
	public static final RegistryObject<Block> SODA_FILL_RED = REGISTRY.register("soda_fill_red", () -> new SodaFillRedBlock());
	public static final RegistryObject<Block> SODA_FILL_GREEN = REGISTRY.register("soda_fill_green", () -> new SodaFillGreenBlock());
	public static final RegistryObject<Block> SODA_FILL_BLUE = REGISTRY.register("soda_fill_blue", () -> new SodaFillBlueBlock());
	public static final RegistryObject<Block> SODA_FILL_YELLOW = REGISTRY.register("soda_fill_yellow", () -> new SodaFillYellowBlock());
	public static final RegistryObject<Block> MOPAND_BUCKET = REGISTRY.register("mopand_bucket", () -> new MopandBucketBlock());
	public static final RegistryObject<Block> MOP_BUCKET = REGISTRY.register("mop_bucket", () -> new MopBucketBlock());
	public static final RegistryObject<Block> WATER_PUDDLE = REGISTRY.register("water_puddle", () -> new WaterPuddleBlock());
	public static final RegistryObject<Block> PEE_PUDDLE = REGISTRY.register("pee_puddle", () -> new PeePuddleBlock());
	public static final RegistryObject<Block> BLOOD_PUDDLE = REGISTRY.register("blood_puddle", () -> new BloodPuddleBlock());
	public static final RegistryObject<Block> POOP_PUDDLE = REGISTRY.register("poop_puddle", () -> new PoopPuddleBlock());
	public static final RegistryObject<Block> SINK = REGISTRY.register("sink", () -> new SinkBlock());
	public static final RegistryObject<Block> DRAIN = REGISTRY.register("drain", () -> new DrainBlock());
	public static final RegistryObject<Block> DRAIN_WATER = REGISTRY.register("drain_water", () -> new DrainWaterBlock());
	public static final RegistryObject<Block> DRAIN_PEE = REGISTRY.register("drain_pee", () -> new DrainPeeBlock());
	public static final RegistryObject<Block> DRAIN_BLOOD = REGISTRY.register("drain_blood", () -> new DrainBloodBlock());
	public static final RegistryObject<Block> DRAIN_POOP = REGISTRY.register("drain_poop", () -> new DrainPoopBlock());
	public static final RegistryObject<Block> SHADOW = REGISTRY.register("shadow", () -> new ShadowBlock());
	public static final RegistryObject<Block> TRASH_BAG_BOX_CLOSED = REGISTRY.register("trash_bag_box_closed", () -> new TrashBagBoxClosedBlock());
	public static final RegistryObject<Block> TRASH_BAG_BOX_OPEN = REGISTRY.register("trash_bag_box_open", () -> new TrashBagBoxOpenBlock());
	public static final RegistryObject<Block> CASH_REGISTER_CLOSED = REGISTRY.register("cash_register_closed", () -> new CashRegisterClosedBlock());
	public static final RegistryObject<Block> CASH_REGISTER_OPEN = REGISTRY.register("cash_register_open", () -> new CashRegisterOpenBlock());
}
