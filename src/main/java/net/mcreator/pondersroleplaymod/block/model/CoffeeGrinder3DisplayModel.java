package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeGrinder3DisplayItem;

public class CoffeeGrinder3DisplayModel extends AnimatedGeoModel<CoffeeGrinder3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder3.png");
	}
}
