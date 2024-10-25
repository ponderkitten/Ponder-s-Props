package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeCupDisplayItem;

public class CoffeeCupDisplayModel extends AnimatedGeoModel<CoffeeCupDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeCupDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeecup.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeCupDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeecup.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeCupDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeecup.png");
	}
}
