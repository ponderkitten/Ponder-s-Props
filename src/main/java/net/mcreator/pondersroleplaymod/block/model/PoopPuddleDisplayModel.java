package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PoopPuddleDisplayItem;

public class PoopPuddleDisplayModel extends AnimatedGeoModel<PoopPuddleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PoopPuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/puddlesmall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PoopPuddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/puddlesmall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PoopPuddleDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/pooppuddle.png");
	}
}
