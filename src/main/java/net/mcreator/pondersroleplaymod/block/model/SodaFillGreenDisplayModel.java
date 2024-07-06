package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SodaFillGreenDisplayItem;

public class SodaFillGreenDisplayModel extends AnimatedGeoModel<SodaFillGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillGreenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillGreenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillGreenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensorgreenfill.png");
	}
}
