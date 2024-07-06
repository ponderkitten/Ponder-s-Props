package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PeePuddleDisplayItem;

public class PeePuddleDisplayModel extends AnimatedGeoModel<PeePuddleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PeePuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PeePuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PeePuddleDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/pisspuddle.png");
	}
}
