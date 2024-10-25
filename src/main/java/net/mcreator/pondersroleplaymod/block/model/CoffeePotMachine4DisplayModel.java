package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeePotMachine4DisplayItem;

public class CoffeePotMachine4DisplayModel extends AnimatedGeoModel<CoffeePotMachine4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachine4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachine4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachine4DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine3.png");
	}
}
