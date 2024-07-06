package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.TrashbinStage1DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.TrashbinStage1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TrashbinStage1DisplayItemRenderer extends GeoItemRenderer<TrashbinStage1DisplayItem> {
	public TrashbinStage1DisplayItemRenderer() {
		super(new TrashbinStage1DisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashbinStage1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
