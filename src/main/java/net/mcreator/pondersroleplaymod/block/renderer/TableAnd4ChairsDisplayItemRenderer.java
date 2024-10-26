package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.TableAnd4ChairsDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.TableAnd4ChairsDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TableAnd4ChairsDisplayItemRenderer extends GeoItemRenderer<TableAnd4ChairsDisplayItem> {
	public TableAnd4ChairsDisplayItemRenderer() {
		super(new TableAnd4ChairsDisplayModel());
	}

	@Override
	public RenderType getRenderType(TableAnd4ChairsDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
