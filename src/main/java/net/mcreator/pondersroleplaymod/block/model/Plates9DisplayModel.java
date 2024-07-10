package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Plates9DisplayItem;

public class Plates9DisplayModel extends AnimatedGeoModel<Plates9DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Plates9DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates9DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates9DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack9.png");
	}
}
