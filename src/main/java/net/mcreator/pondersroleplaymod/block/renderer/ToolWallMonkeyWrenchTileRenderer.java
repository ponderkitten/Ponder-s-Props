package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.ToolWallMonkeyWrenchBlockModel;
import net.mcreator.pondersroleplaymod.block.entity.ToolWallMonkeyWrenchTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToolWallMonkeyWrenchTileRenderer extends GeoBlockRenderer<ToolWallMonkeyWrenchTileEntity> {
	public ToolWallMonkeyWrenchTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new ToolWallMonkeyWrenchBlockModel());
	}

	@Override
	public RenderType getRenderType(ToolWallMonkeyWrenchTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
