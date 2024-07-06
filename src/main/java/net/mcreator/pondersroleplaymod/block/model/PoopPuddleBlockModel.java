package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PoopPuddleTileEntity;

public class PoopPuddleBlockModel extends AnimatedGeoModel<PoopPuddleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PoopPuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PoopPuddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PoopPuddleTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/pooppuddle.png");
	}
}
