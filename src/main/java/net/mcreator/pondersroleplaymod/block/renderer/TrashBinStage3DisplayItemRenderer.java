package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.TrashBinStage3DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.TrashBinStage3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TrashBinStage3DisplayItemRenderer extends GeoItemRenderer<TrashBinStage3DisplayItem> {
	public TrashBinStage3DisplayItemRenderer() {
		super(new TrashBinStage3DisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashBinStage3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
