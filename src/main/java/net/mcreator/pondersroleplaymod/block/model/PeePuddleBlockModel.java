package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PeePuddleTileEntity;

public class PeePuddleBlockModel extends AnimatedGeoModel<PeePuddleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PeePuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PeePuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PeePuddleTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/pisspuddle.png");
	}
}
