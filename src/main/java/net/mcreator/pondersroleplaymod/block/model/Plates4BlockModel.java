package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates4TileEntity;

public class Plates4BlockModel extends AnimatedGeoModel<Plates4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack4.png");
	}
}
