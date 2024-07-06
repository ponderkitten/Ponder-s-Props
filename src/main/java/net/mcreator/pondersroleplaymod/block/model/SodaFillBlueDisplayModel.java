package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SodaFillBlueDisplayItem;

public class SodaFillBlueDisplayModel extends AnimatedGeoModel<SodaFillBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillBlueDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillBlueDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillBlueDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensorbluefill.png");
	}
}
