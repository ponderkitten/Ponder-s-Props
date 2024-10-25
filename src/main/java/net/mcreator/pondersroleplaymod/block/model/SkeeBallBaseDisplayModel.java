package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SkeeBallBaseDisplayItem;

public class SkeeBallBaseDisplayModel extends AnimatedGeoModel<SkeeBallBaseDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SkeeBallBaseDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/skeeballbase.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeBallBaseDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/skeeballbase.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeBallBaseDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/skeeballbase.png");
	}
}
