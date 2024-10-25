package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballTowerPinkDisplayItem;

public class GumballTowerPinkDisplayModel extends AnimatedGeoModel<GumballTowerPinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerPinkDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerPinkDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerPinkDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowerpink.png");
	}
}
