package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornMakerTop3DisplayItem;

public class PopcornMakerTop3DisplayModel extends AnimatedGeoModel<PopcornMakerTop3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMakerTop3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMakerTop3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMakerTop3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop3.png");
	}
}
