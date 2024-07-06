package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SodaDispensorTileEntity;

public class SodaDispensorBlockModel extends AnimatedGeoModel<SodaDispensorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SodaDispensorTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaDispensorTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaDispensorTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensoridle.png");
	}
}
