package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.WoodenBoards2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.WoodenBoards2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WoodenBoards2DisplayItemRenderer extends GeoItemRenderer<WoodenBoards2DisplayItem> {
	public WoodenBoards2DisplayItemRenderer() {
		super(new WoodenBoards2DisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenBoards2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
