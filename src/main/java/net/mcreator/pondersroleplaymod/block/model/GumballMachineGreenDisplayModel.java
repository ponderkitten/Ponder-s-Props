package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballMachineGreenDisplayItem;

public class GumballMachineGreenDisplayModel extends AnimatedGeoModel<GumballMachineGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballMachineGreenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballMachineGreenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballMachineGreenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballgreen.png");
	}
}
