package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeMaker2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeMaker2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeMaker2DisplayItemRenderer extends GeoItemRenderer<CoffeeMaker2DisplayItem> {
	public CoffeeMaker2DisplayItemRenderer() {
		super(new CoffeeMaker2DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeMaker2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
