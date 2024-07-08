package net.mcreator.pondersroleplaymod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlockEntities;
import net.mcreator.pondersroleplaymod.block.renderer.WoodenBoards3TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.WoodenBoards2TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.WoodenBoards1TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.WaterPuddleTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.WallBroomTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.WallBroomDustpanTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.TrashbinStage2TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.TrashbinStage1TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.TrashBinStage3TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.TrashBinEmptyTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.TrashBagBoxOpenTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.TrashBagBoxClosedTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.Trash5TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.Trash4TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.Trash3TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.Trash2TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.Trash1TileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.SodaFillYellowTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.SodaFillRedTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.SodaFillGreenTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.SodaFillBlueTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.SodaDispensorTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.SinkTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.PoopPuddleTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.PeePuddleTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.PaperOpenSignTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.PaperClosedSignTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.MopandBucketTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.MopBucketTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.FullTrashBinTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.DrainWaterTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.DrainTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.DrainPoopTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.DrainPeeTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.DrainBloodTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.ClosedNoteTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.CashRegisterOpenTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.CashRegisterClosedTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.BloodPuddleTileRenderer;
import net.mcreator.pondersroleplaymod.block.renderer.BaggedTrashBinTileRenderer;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

@Mod.EventBusSubscriber(modid = PondersRoleplayModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASHBIN_STAGE_1.get(), TrashbinStage1TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_BIN_EMPTY.get(), TrashBinEmptyTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASHBIN_STAGE_2.get(), TrashbinStage2TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_BIN_STAGE_3.get(), TrashBinStage3TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.FULL_TRASH_BIN.get(), FullTrashBinTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.BAGGED_TRASH_BIN.get(), BaggedTrashBinTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.SODA_DISPENSOR.get(), SodaDispensorTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.SODA_FILL_RED.get(), SodaFillRedTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.SODA_FILL_GREEN.get(), SodaFillGreenTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.SODA_FILL_BLUE.get(), SodaFillBlueTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.SODA_FILL_YELLOW.get(), SodaFillYellowTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.MOPAND_BUCKET.get(), MopandBucketTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.MOP_BUCKET.get(), MopBucketTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.WATER_PUDDLE.get(), WaterPuddleTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.PEE_PUDDLE.get(), PeePuddleTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.BLOOD_PUDDLE.get(), BloodPuddleTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.POOP_PUDDLE.get(), PoopPuddleTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.SINK.get(), SinkTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.DRAIN.get(), DrainTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.DRAIN_WATER.get(), DrainWaterTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.DRAIN_PEE.get(), DrainPeeTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.DRAIN_BLOOD.get(), DrainBloodTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.DRAIN_POOP.get(), DrainPoopTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_BAG_BOX_CLOSED.get(), TrashBagBoxClosedTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_BAG_BOX_OPEN.get(), TrashBagBoxOpenTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.CASH_REGISTER_CLOSED.get(), CashRegisterClosedTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.CASH_REGISTER_OPEN.get(), CashRegisterOpenTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.WALL_BROOM.get(), WallBroomTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.WALL_BROOM_DUSTPAN.get(), WallBroomDustpanTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_1.get(), Trash1TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_2.get(), Trash2TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_3.get(), Trash3TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_4.get(), Trash4TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.TRASH_5.get(), Trash5TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.WOODEN_BOARDS_3.get(), WoodenBoards3TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.WOODEN_BOARDS_2.get(), WoodenBoards2TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.WOODEN_BOARDS_1.get(), WoodenBoards1TileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.CLOSED_NOTE.get(), ClosedNoteTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.PAPER_OPEN_SIGN.get(), PaperOpenSignTileRenderer::new);
		event.registerBlockEntityRenderer(PondersRoleplayModModBlockEntities.PAPER_CLOSED_SIGN.get(), PaperClosedSignTileRenderer::new);
	}
}
