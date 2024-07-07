package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Trash3DisplayItem;

public class Trash3DisplayModel extends AnimatedGeoModel<Trash3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Trash3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash3.png");
	}
}
