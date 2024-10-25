package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.GumballTowerGreenDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.GumballTowerGreenDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GumballTowerGreenDisplayItemRenderer extends GeoItemRenderer<GumballTowerGreenDisplayItem> {
	public GumballTowerGreenDisplayItemRenderer() {
		super(new GumballTowerGreenDisplayModel());
	}

	@Override
	public RenderType getRenderType(GumballTowerGreenDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
