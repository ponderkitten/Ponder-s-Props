package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Plates7DisplayItem;

public class Plates7DisplayModel extends AnimatedGeoModel<Plates7DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Plates7DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates7DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates7DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack7.png");
	}
}
