package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeMaker4DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeMaker4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeMaker4DisplayItemRenderer extends GeoItemRenderer<CoffeeMaker4DisplayItem> {
	public CoffeeMaker4DisplayItemRenderer() {
		super(new CoffeeMaker4DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeMaker4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
