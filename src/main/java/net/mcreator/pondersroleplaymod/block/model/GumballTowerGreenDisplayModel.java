package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballTowerGreenDisplayItem;

public class GumballTowerGreenDisplayModel extends AnimatedGeoModel<GumballTowerGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerGreenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerGreenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerGreenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowergreen.png");
	}
}
