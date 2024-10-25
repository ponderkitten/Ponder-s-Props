package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.ClawMachineDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.ClawMachineDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ClawMachineDisplayItemRenderer extends GeoItemRenderer<ClawMachineDisplayItem> {
	public ClawMachineDisplayItemRenderer() {
		super(new ClawMachineDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClawMachineDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
