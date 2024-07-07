package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.Trash5DisplayItem;

public class Trash5DisplayModel extends AnimatedGeoModel<Trash5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Trash5DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash5DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash5DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash5.png");
	}
}
