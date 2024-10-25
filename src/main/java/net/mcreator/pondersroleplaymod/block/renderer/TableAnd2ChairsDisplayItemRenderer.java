package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.TableAnd2ChairsDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.TableAnd2ChairsDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TableAnd2ChairsDisplayItemRenderer extends GeoItemRenderer<TableAnd2ChairsDisplayItem> {
	public TableAnd2ChairsDisplayItemRenderer() {
		super(new TableAnd2ChairsDisplayModel());
	}

	@Override
	public RenderType getRenderType(TableAnd2ChairsDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
