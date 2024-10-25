package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballTowerRedTileEntity;

public class GumballTowerRedBlockModel extends AnimatedGeoModel<GumballTowerRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerRedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerRedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerRedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowerred.png");
	}
}
