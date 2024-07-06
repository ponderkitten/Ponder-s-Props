package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WaterPuddleTileEntity;

public class WaterPuddleBlockModel extends AnimatedGeoModel<WaterPuddleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WaterPuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterPuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterPuddleTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/waterpuddle.png");
	}
}
