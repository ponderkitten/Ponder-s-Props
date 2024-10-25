package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.HomeDepotBoxClosedDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.HomeDepotBoxClosedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HomeDepotBoxClosedDisplayItemRenderer extends GeoItemRenderer<HomeDepotBoxClosedDisplayItem> {
	public HomeDepotBoxClosedDisplayItemRenderer() {
		super(new HomeDepotBoxClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(HomeDepotBoxClosedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
