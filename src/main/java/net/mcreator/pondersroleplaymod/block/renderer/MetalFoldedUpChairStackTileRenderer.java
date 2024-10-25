package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.MetalFoldedUpChairStackBlockModel;
import net.mcreator.pondersroleplaymod.block.entity.MetalFoldedUpChairStackTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MetalFoldedUpChairStackTileRenderer extends GeoBlockRenderer<MetalFoldedUpChairStackTileEntity> {
	public MetalFoldedUpChairStackTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new MetalFoldedUpChairStackBlockModel());
	}

	@Override
	public RenderType getRenderType(MetalFoldedUpChairStackTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
