package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Trash1DisplayItem;

public class Trash1DisplayModel extends AnimatedGeoModel<Trash1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Trash1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash1DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash1.png");
	}
}
