package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FrenchPress3DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FrenchPress3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrenchPress3DisplayItemRenderer extends GeoItemRenderer<FrenchPress3DisplayItem> {
	public FrenchPress3DisplayItemRenderer() {
		super(new FrenchPress3DisplayModel());
	}

	@Override
	public RenderType getRenderType(FrenchPress3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
