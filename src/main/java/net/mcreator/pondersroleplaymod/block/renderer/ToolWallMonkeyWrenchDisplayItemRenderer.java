package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.ToolWallMonkeyWrenchDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.ToolWallMonkeyWrenchDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToolWallMonkeyWrenchDisplayItemRenderer extends GeoItemRenderer<ToolWallMonkeyWrenchDisplayItem> {
	public ToolWallMonkeyWrenchDisplayItemRenderer() {
		super(new ToolWallMonkeyWrenchDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToolWallMonkeyWrenchDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
