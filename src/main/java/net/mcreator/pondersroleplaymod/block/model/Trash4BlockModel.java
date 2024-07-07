package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Trash4TileEntity;

public class Trash4BlockModel extends AnimatedGeoModel<Trash4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Trash4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Trash4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Trash4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/trash4.png");
	}
}
