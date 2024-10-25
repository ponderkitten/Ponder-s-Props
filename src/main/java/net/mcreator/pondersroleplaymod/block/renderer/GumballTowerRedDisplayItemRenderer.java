package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.GumballTowerRedDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.GumballTowerRedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GumballTowerRedDisplayItemRenderer extends GeoItemRenderer<GumballTowerRedDisplayItem> {
	public GumballTowerRedDisplayItemRenderer() {
		super(new GumballTowerRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(GumballTowerRedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
