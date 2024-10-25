package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Popcornmakertop1TileEntity;

public class Popcornmakertop1BlockModel extends AnimatedGeoModel<Popcornmakertop1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Popcornmakertop1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmakertop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Popcornmakertop1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmakertop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Popcornmakertop1TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakertop1.png");
	}
}
