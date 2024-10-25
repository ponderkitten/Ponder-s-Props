package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeePotMachine3DisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeePotMachine3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeePotMachine3DisplayItemRenderer extends GeoItemRenderer<CoffeePotMachine3DisplayItem> {
	public CoffeePotMachine3DisplayItemRenderer() {
		super(new CoffeePotMachine3DisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeePotMachine3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
