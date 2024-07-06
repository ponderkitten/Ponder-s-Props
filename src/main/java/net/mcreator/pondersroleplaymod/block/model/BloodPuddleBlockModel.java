package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.BloodPuddleTileEntity;

public class BloodPuddleBlockModel extends AnimatedGeoModel<BloodPuddleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BloodPuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BloodPuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BloodPuddleTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/bloodpuddle.png");
	}
}
