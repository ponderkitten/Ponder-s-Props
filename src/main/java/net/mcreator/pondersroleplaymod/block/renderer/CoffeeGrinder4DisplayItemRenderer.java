package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeGrinder4DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeGrinder4DisplayItemRenderer extends GeoItemRenderer<CoffeeGrinder4DisplayItem> {
	public CoffeeGrinder4DisplayItemRenderer() {
		super(new CoffeeGrinder4DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeGrinder4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
