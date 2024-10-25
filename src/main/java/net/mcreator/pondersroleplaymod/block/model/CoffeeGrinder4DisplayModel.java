package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder4DisplayItem;

public class CoffeeGrinder4DisplayModel extends AnimatedGeoModel<CoffeeGrinder4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder4DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder4.png");
	}
}
