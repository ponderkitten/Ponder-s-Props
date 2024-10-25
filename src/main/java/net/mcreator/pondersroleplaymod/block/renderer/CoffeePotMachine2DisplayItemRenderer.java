package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeePotMachine2DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeePotMachine2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeePotMachine2DisplayItemRenderer extends GeoItemRenderer<CoffeePotMachine2DisplayItem> {
	public CoffeePotMachine2DisplayItemRenderer() {
		super(new CoffeePotMachine2DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeePotMachine2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
