package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.MopandBucketDisplayItem;

public class MopandBucketDisplayModel extends AnimatedGeoModel<MopandBucketDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MopandBucketDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/mopbucket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MopandBucketDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/mopbucket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MopandBucketDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/mopandbucket.png");
	}
}
