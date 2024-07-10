package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.Plates11DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.Plates11DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Plates11DisplayItemRenderer extends GeoItemRenderer<Plates11DisplayItem> {
	public Plates11DisplayItemRenderer() {
		super(new Plates11DisplayModel());
	}

	@Override
	public RenderType getRenderType(Plates11DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
