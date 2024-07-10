package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Plates6DisplayItem;

public class Plates6DisplayModel extends AnimatedGeoModel<Plates6DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Plates6DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates6DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates6DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack6.png");
	}
}
