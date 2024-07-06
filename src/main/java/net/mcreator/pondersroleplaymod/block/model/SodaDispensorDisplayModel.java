package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SodaDispensorDisplayItem;

public class SodaDispensorDisplayModel extends AnimatedGeoModel<SodaDispensorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SodaDispensorDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaDispensorDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaDispensorDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensoridle.png");
	}
}
