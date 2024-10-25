package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SkeeBallRampTileEntity;

public class SkeeBallRampBlockModel extends AnimatedGeoModel<SkeeBallRampTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkeeBallRampTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/skeeballramp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeBallRampTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/skeeballramp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeBallRampTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/skeeballramp.png");
	}
}
