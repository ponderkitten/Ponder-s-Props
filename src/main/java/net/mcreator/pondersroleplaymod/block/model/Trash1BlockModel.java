package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Trash1TileEntity;

public class Trash1BlockModel extends AnimatedGeoModel<Trash1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Trash1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash1TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash1.png");
	}
}
