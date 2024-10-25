package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FrenchPress4DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FrenchPress4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrenchPress4DisplayItemRenderer extends GeoItemRenderer<FrenchPress4DisplayItem> {
	public FrenchPress4DisplayItemRenderer() {
		super(new FrenchPress4DisplayModel());
	}

	@Override
	public RenderType getRenderType(FrenchPress4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
