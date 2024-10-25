package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.EnclosedTrashBinBaggedBlockModel;
import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinBaggedTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EnclosedTrashBinBaggedTileRenderer extends GeoBlockRenderer<EnclosedTrashBinBaggedTileEntity> {
	public EnclosedTrashBinBaggedTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new EnclosedTrashBinBaggedBlockModel());
	}

	@Override
	public RenderType getRenderType(EnclosedTrashBinBaggedTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
