package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeMakerDisplayItem;

public class CoffeeMakerDisplayModel extends AnimatedGeoModel<CoffeeMakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeMakerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeMakerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeMakerDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeemakerempty.png");
	}
}
