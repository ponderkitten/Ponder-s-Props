package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.PopcornMakerTop4DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.PopcornMakerTop4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PopcornMakerTop4DisplayItemRenderer extends GeoItemRenderer<PopcornMakerTop4DisplayItem> {
	public PopcornMakerTop4DisplayItemRenderer() {
		super(new PopcornMakerTop4DisplayModel());
	}

	@Override
	public RenderType getRenderType(PopcornMakerTop4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
