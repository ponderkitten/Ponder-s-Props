package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeMaker3DisplayItem;

public class CoffeeMaker3DisplayModel extends AnimatedGeoModel<CoffeeMaker3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeMaker3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeMaker3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeMaker3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeemakerpouring.png");
	}
}
