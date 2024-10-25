package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.BloodPuddleDisplayItem;

public class BloodPuddleDisplayModel extends AnimatedGeoModel<BloodPuddleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BloodPuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BloodPuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BloodPuddleDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/blood.png");
	}
}
