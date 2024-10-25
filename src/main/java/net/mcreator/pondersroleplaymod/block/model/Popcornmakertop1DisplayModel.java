package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Popcornmakertop1DisplayItem;

public class Popcornmakertop1DisplayModel extends AnimatedGeoModel<Popcornmakertop1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Popcornmakertop1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Popcornmakertop1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Popcornmakertop1DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop1.png");
	}
}
