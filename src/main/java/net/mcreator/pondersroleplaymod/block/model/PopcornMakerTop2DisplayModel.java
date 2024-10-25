package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornMakerTop2DisplayItem;

public class PopcornMakerTop2DisplayModel extends AnimatedGeoModel<PopcornMakerTop2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMakerTop2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMakerTop2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMakerTop2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop2.png");
	}
}
