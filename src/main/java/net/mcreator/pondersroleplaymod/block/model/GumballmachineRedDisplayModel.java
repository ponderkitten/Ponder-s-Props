package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballmachineRedDisplayItem;

public class GumballmachineRedDisplayModel extends AnimatedGeoModel<GumballmachineRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballmachineRedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballmachineRedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballmachineRedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballred.png");
	}
}
