package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballTowerRedDisplayItem;

public class GumballTowerRedDisplayModel extends AnimatedGeoModel<GumballTowerRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerRedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerRedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerRedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowerred.png");
	}
}
