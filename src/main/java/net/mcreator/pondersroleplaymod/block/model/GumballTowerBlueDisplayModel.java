package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballTowerBlueDisplayItem;

public class GumballTowerBlueDisplayModel extends AnimatedGeoModel<GumballTowerBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerBlueDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerBlueDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerBlueDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowerblue.png");
	}
}
