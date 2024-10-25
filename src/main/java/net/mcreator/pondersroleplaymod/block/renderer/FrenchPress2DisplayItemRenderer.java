package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FrenchPress2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FrenchPress2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrenchPress2DisplayItemRenderer extends GeoItemRenderer<FrenchPress2DisplayItem> {
	public FrenchPress2DisplayItemRenderer() {
		super(new FrenchPress2DisplayModel());
	}

	@Override
	public RenderType getRenderType(FrenchPress2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
