package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeMaker3DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeMaker3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeMaker3DisplayItemRenderer extends GeoItemRenderer<CoffeeMaker3DisplayItem> {
	public CoffeeMaker3DisplayItemRenderer() {
		super(new CoffeeMaker3DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeMaker3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
