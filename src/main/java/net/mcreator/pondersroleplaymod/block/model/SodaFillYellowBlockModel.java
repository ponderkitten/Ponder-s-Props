package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SodaFillYellowTileEntity;

public class SodaFillYellowBlockModel extends AnimatedGeoModel<SodaFillYellowTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillYellowTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillYellowTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillYellowTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensoryellowfill.png");
	}
}
