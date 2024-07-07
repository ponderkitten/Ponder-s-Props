package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WallBroomTileEntity;

public class WallBroomBlockModel extends AnimatedGeoModel<WallBroomTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallBroomTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/broomdustpan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallBroomTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/broomdustpan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallBroomTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/wallbroom.png");
	}
}
