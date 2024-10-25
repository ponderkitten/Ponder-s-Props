package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.GumballmachineRedDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.GumballmachineRedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GumballmachineRedDisplayItemRenderer extends GeoItemRenderer<GumballmachineRedDisplayItem> {
	public GumballmachineRedDisplayItemRenderer() {
		super(new GumballmachineRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(GumballmachineRedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
