package net.mcreator.pondersroleplaymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pondersroleplaymod.block.model.CoffeePotMachineDisplayModel;
import net.mcreator.pondersroleplaymod.block.display.CoffeePotMachineDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoffeePotMachineDisplayItemRenderer extends GeoItemRenderer<CoffeePotMachineDisplayItem> {
	public CoffeePotMachineDisplayItemRenderer() {
		super(new CoffeePotMachineDisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffeePotMachineDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
