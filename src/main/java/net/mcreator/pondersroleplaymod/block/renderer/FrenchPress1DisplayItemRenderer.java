package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FrenchPress1DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FrenchPress1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrenchPress1DisplayItemRenderer extends GeoItemRenderer<FrenchPress1DisplayItem> {
	public FrenchPress1DisplayItemRenderer() {
		super(new FrenchPress1DisplayModel());
	}

	@Override
	public RenderType getRenderType(FrenchPress1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}