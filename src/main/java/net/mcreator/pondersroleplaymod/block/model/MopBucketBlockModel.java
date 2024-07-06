package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.MopBucketTileEntity;

public class MopBucketBlockModel extends AnimatedGeoModel<MopBucketTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MopBucketTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/mopbucket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MopBucketTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/mopbucket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MopBucketTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/mopbucket.png");
	}
}
