package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.MopBucketDisplayItem;

public class MopBucketDisplayModel extends AnimatedGeoModel<MopBucketDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MopBucketDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/mopbucket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MopBucketDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/mopbucket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MopBucketDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/mopbucket.png");
	}
}
