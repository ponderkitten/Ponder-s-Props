package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.PopcornMakerTop2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.PopcornMakerTop2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PopcornMakerTop2DisplayItemRenderer extends GeoItemRenderer<PopcornMakerTop2DisplayItem> {
	public PopcornMakerTop2DisplayItemRenderer() {
		super(new PopcornMakerTop2DisplayModel());
	}

	@Override
	public RenderType getRenderType(PopcornMakerTop2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
