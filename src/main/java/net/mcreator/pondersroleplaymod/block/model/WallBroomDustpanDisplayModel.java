package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WallBroomDustpanDisplayItem;

public class WallBroomDustpanDisplayModel extends AnimatedGeoModel<WallBroomDustpanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WallBroomDustpanDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/broomdustpan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallBroomDustpanDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/broomdustpan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallBroomDustpanDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/broomdustpan.png");
	}
}
