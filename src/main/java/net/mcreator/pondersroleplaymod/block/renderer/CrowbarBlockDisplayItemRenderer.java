package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CrowbarBlockDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CrowbarBlockDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CrowbarBlockDisplayItemRenderer extends GeoItemRenderer<CrowbarBlockDisplayItem> {
	public CrowbarBlockDisplayItemRenderer() {
		super(new CrowbarBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CrowbarBlockDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
