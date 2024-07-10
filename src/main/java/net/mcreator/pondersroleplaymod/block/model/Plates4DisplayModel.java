package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Plates4DisplayItem;

public class Plates4DisplayModel extends AnimatedGeoModel<Plates4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Plates4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates4DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack4.png");
	}
}
