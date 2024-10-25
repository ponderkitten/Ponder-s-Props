package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballTowerBlueTileEntity;

public class GumballTowerBlueBlockModel extends AnimatedGeoModel<GumballTowerBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerBlueTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerBlueTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerBlueTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowerblue.png");
	}
}
