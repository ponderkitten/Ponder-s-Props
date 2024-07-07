package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Trash4DisplayItem;

public class Trash4DisplayModel extends AnimatedGeoModel<Trash4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Trash4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash4DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash4.png");
	}
}
