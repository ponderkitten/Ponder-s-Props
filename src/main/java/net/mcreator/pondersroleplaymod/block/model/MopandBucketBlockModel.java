package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.MopandBucketTileEntity;

public class MopandBucketBlockModel extends AnimatedGeoModel<MopandBucketTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MopandBucketTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/mopbucket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MopandBucketTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/mopbucket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MopandBucketTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/mopandbucket.png");
	}
}
