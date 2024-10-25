package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.SkeeBallGoalDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.SkeeBallGoalDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SkeeBallGoalDisplayItemRenderer extends GeoItemRenderer<SkeeBallGoalDisplayItem> {
	public SkeeBallGoalDisplayItemRenderer() {
		super(new SkeeBallGoalDisplayModel());
	}

	@Override
	public RenderType getRenderType(SkeeBallGoalDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
