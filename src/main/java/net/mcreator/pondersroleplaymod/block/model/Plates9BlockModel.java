package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates9TileEntity;

public class Plates9BlockModel extends AnimatedGeoModel<Plates9TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates9TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates9TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates9TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack9.png");
	}
}
