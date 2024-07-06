package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SodaFillYellowDisplayItem;

public class SodaFillYellowDisplayModel extends AnimatedGeoModel<SodaFillYellowDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillYellowDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillYellowDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillYellowDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensoryellowfill.png");
	}
}
