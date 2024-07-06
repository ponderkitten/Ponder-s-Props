package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SodaFillBlueTileEntity;

public class SodaFillBlueBlockModel extends AnimatedGeoModel<SodaFillBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillBlueTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillBlueTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillBlueTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensorbluefill.png");
	}
}
