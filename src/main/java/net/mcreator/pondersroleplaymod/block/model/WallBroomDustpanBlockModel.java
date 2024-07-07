package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WallBroomDustpanTileEntity;

public class WallBroomDustpanBlockModel extends AnimatedGeoModel<WallBroomDustpanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallBroomDustpanTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/broomdustpan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallBroomDustpanTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/broomdustpan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallBroomDustpanTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/broomdustpan.png");
	}
}
