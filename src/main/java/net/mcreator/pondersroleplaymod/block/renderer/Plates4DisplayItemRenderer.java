package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.Plates4DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.Plates4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Plates4DisplayItemRenderer extends GeoItemRenderer<Plates4DisplayItem> {
	public Plates4DisplayItemRenderer() {
		super(new Plates4DisplayModel());
	}

	@Override
	public RenderType getRenderType(Plates4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
