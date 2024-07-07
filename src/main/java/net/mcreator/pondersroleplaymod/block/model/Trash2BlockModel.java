package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Trash2TileEntity;

public class Trash2BlockModel extends AnimatedGeoModel<Trash2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Trash2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash2.png");
	}
}
