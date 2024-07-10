package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates5TileEntity;

public class Plates5BlockModel extends AnimatedGeoModel<Plates5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates5TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates5TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates5TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack5.png");
	}
}
