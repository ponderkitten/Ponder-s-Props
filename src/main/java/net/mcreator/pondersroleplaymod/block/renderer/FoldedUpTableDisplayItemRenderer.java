package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FoldedUpTableDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FoldedUpTableDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoldedUpTableDisplayItemRenderer extends GeoItemRenderer<FoldedUpTableDisplayItem> {
	public FoldedUpTableDisplayItemRenderer() {
		super(new FoldedUpTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoldedUpTableDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}