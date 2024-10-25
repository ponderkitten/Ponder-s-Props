package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.PickleJarOpenBlockModel;
import net.mcreator.pondersroleplaymod.block.entity.PickleJarOpenTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PickleJarOpenTileRenderer extends GeoBlockRenderer<PickleJarOpenTileEntity> {
	public PickleJarOpenTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new PickleJarOpenBlockModel());
	}

	@Override
	public RenderType getRenderType(PickleJarOpenTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
