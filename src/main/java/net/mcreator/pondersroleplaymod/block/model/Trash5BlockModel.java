package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Trash5TileEntity;

public class Trash5BlockModel extends AnimatedGeoModel<Trash5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Trash5TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash5TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash5TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash5.png");
	}
}
