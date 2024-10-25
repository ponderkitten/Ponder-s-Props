package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeeBeanBagOpenDisplayItem;

public class CoffeeBeanBagOpenDisplayModel extends AnimatedGeoModel<CoffeeBeanBagOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeBeanBagOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeebeanbagopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeBeanBagOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeebeanbagopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeBeanBagOpenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeebeanbagopen.png");
	}
}
