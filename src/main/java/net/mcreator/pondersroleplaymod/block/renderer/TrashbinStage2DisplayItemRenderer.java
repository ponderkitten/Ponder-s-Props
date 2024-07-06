package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.TrashbinStage2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.TrashbinStage2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TrashbinStage2DisplayItemRenderer extends GeoItemRenderer<TrashbinStage2DisplayItem> {
	public TrashbinStage2DisplayItemRenderer() {
		super(new TrashbinStage2DisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashbinStage2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
