package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Trash3TileEntity;

public class Trash3BlockModel extends AnimatedGeoModel<Trash3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Trash3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash3.png");
	}
}
