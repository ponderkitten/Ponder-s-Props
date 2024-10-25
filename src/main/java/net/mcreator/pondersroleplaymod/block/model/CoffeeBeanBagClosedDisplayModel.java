package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeBeanBagClosedDisplayItem;

public class CoffeeBeanBagClosedDisplayModel extends AnimatedGeoModel<CoffeeBeanBagClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeBeanBagClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeebeanbagclosed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeBeanBagClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeebeanbagclosed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeBeanBagClosedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeebeanbagclosed.png");
	}
}
