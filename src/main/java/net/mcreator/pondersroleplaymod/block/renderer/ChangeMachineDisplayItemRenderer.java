package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.ChangeMachineDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.ChangeMachineDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChangeMachineDisplayItemRenderer extends GeoItemRenderer<ChangeMachineDisplayItem> {
	public ChangeMachineDisplayItemRenderer() {
		super(new ChangeMachineDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChangeMachineDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
