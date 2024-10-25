package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SkeeBallRampDisplayItem;

public class SkeeBallRampDisplayModel extends AnimatedGeoModel<SkeeBallRampDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SkeeBallRampDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/skeeballramp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeBallRampDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/skeeballramp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeBallRampDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/skeeballramp.png");
	}
}
