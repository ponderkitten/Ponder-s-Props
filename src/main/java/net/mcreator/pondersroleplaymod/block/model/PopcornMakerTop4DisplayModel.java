package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornMakerTop4DisplayItem;

public class PopcornMakerTop4DisplayModel extends AnimatedGeoModel<PopcornMakerTop4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMakerTop4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMakerTop4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMakerTop4DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop4.png");
	}
}
