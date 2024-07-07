package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WallBroomDisplayItem;

public class WallBroomDisplayModel extends AnimatedGeoModel<WallBroomDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WallBroomDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/broomdustpan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallBroomDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/broomdustpan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallBroomDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/wallbroom.png");
	}
}
