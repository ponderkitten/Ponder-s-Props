package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.DrainBloodDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.DrainBloodDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DrainBloodDisplayItemRenderer extends GeoItemRenderer<DrainBloodDisplayItem> {
	public DrainBloodDisplayItemRenderer() {
		super(new DrainBloodDisplayModel());
	}

	@Override
	public RenderType getRenderType(DrainBloodDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
