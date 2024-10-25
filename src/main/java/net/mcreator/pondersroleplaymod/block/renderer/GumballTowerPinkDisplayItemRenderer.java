package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.GumballTowerPinkDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.GumballTowerPinkDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GumballTowerPinkDisplayItemRenderer extends GeoItemRenderer<GumballTowerPinkDisplayItem> {
	public GumballTowerPinkDisplayItemRenderer() {
		super(new GumballTowerPinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(GumballTowerPinkDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
