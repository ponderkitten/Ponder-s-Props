package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Trash2DisplayItem;

public class Trash2DisplayModel extends AnimatedGeoModel<Trash2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Trash2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash2.png");
	}
}
