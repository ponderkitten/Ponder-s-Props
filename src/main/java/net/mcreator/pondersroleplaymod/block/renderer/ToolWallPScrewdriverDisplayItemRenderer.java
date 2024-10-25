package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.ToolWallPScrewdriverDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.ToolWallPScrewdriverDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToolWallPScrewdriverDisplayItemRenderer extends GeoItemRenderer<ToolWallPScrewdriverDisplayItem> {
	public ToolWallPScrewdriverDisplayItemRenderer() {
		super(new ToolWallPScrewdriverDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToolWallPScrewdriverDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
