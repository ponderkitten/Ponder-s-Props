package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PopcornMakerTop2TileEntity;

public class PopcornMakerTop2BlockModel extends AnimatedGeoModel<PopcornMakerTop2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMakerTop2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMakerTop2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMakerTop2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop2.png");
	}
}
