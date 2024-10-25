package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballTowerGreenTileEntity;

public class GumballTowerGreenBlockModel extends AnimatedGeoModel<GumballTowerGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerGreenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerGreenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerGreenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowergreen.png");
	}
}
