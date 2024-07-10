package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Plates8DisplayItem;

public class Plates8DisplayModel extends AnimatedGeoModel<Plates8DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Plates8DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates8DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates8DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack8.png");
	}
}
