package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CoffeePotMachineDisplayItem;

public class CoffeePotMachineDisplayModel extends AnimatedGeoModel<CoffeePotMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachineDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine1.png");
	}
}
