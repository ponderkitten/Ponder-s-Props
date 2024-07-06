package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WaterPuddleDisplayItem;

public class WaterPuddleDisplayModel extends AnimatedGeoModel<WaterPuddleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WaterPuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterPuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterPuddleDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/waterpuddle.png");
	}
}
