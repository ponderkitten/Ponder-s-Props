package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FlashlightBlockOffDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FlashlightBlockOffDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FlashlightBlockOffDisplayItemRenderer extends GeoItemRenderer<FlashlightBlockOffDisplayItem> {
	public FlashlightBlockOffDisplayItemRenderer() {
		super(new FlashlightBlockOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(FlashlightBlockOffDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
