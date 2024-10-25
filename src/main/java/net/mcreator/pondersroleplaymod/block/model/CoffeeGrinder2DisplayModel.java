package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder2DisplayItem;

public class CoffeeGrinder2DisplayModel extends AnimatedGeoModel<CoffeeGrinder2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder2.png");
	}
}
