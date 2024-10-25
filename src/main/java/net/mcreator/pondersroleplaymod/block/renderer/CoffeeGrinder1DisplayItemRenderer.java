package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeGrinder1DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeGrinder1DisplayItemRenderer extends GeoItemRenderer<CoffeeGrinder1DisplayItem> {
	public CoffeeGrinder1DisplayItemRenderer() {
		super(new CoffeeGrinder1DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeGrinder1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}