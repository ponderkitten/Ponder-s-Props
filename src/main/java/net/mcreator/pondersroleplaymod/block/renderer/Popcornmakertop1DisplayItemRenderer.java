package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.Popcornmakertop1DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.Popcornmakertop1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Popcornmakertop1DisplayItemRenderer extends GeoItemRenderer<Popcornmakertop1DisplayItem> {
	public Popcornmakertop1DisplayItemRenderer() {
		super(new Popcornmakertop1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Popcornmakertop1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
