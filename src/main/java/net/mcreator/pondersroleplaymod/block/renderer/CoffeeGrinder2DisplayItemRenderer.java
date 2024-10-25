package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeGrinder2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeGrinder2DisplayItemRenderer extends GeoItemRenderer<CoffeeGrinder2DisplayItem> {
	public CoffeeGrinder2DisplayItemRenderer() {
		super(new CoffeeGrinder2DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeGrinder2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
