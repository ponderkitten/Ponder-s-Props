package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates8TileEntity;

public class Plates8BlockModel extends AnimatedGeoModel<Plates8TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates8TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates8TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates8TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack8.png");
	}
}
