package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeePotMachine2DisplayItem;

public class CoffeePotMachine2DisplayModel extends AnimatedGeoModel<CoffeePotMachine2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachine2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachine2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachine2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine2.png");
	}
}
