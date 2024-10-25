package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.PickleJarClosedDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.PickleJarClosedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PickleJarClosedDisplayItemRenderer extends GeoItemRenderer<PickleJarClosedDisplayItem> {
	public PickleJarClosedDisplayItemRenderer() {
		super(new PickleJarClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PickleJarClosedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
