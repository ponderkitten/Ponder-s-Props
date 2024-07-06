package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.FullTrashBinDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.FullTrashBinDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FullTrashBinDisplayItemRenderer extends GeoItemRenderer<FullTrashBinDisplayItem> {
	public FullTrashBinDisplayItemRenderer() {
		super(new FullTrashBinDisplayModel());
	}

	@Override
	public RenderType getRenderType(FullTrashBinDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
