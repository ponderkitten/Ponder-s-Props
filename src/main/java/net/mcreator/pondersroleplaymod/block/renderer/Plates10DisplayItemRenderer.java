package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.Plates10DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.Plates10DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Plates10DisplayItemRenderer extends GeoItemRenderer<Plates10DisplayItem> {
	public Plates10DisplayItemRenderer() {
		super(new Plates10DisplayModel());
	}

	@Override
	public RenderType getRenderType(Plates10DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
