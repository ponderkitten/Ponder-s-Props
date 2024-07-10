package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates6TileEntity;

public class Plates6BlockModel extends AnimatedGeoModel<Plates6TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates6TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates6TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates6TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack6.png");
	}
}
