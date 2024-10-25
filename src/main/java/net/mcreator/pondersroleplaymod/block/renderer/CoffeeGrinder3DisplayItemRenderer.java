package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeeGrinder3DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeeGrinder3DisplayItemRenderer extends GeoItemRenderer<CoffeeGrinder3DisplayItem> {
	public CoffeeGrinder3DisplayItemRenderer() {
		super(new CoffeeGrinder3DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeeGrinder3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
