package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.WoodenBoards3DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.WoodenBoards3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WoodenBoards3DisplayItemRenderer extends GeoItemRenderer<WoodenBoards3DisplayItem> {
	public WoodenBoards3DisplayItemRenderer() {
		super(new WoodenBoards3DisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenBoards3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
