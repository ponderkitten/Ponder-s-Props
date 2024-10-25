package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PopcornMakerTop4TileEntity;

public class PopcornMakerTop4BlockModel extends AnimatedGeoModel<PopcornMakerTop4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMakerTop4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMakerTop4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMakerTop4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop4.png");
	}
}
