package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.WallBroomDustpanDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.WallBroomDustpanDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WallBroomDustpanDisplayItemRenderer extends GeoItemRenderer<WallBroomDustpanDisplayItem> {
	public WallBroomDustpanDisplayItemRenderer() {
		super(new WallBroomDustpanDisplayModel());
	}

	@Override
	public RenderType getRenderType(WallBroomDustpanDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
