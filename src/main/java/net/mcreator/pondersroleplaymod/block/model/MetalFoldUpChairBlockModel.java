package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.MetalFoldUpChairTileEntity;

public class MetalFoldUpChairBlockModel extends AnimatedGeoModel<MetalFoldUpChairTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MetalFoldUpChairTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/metalfoldupchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MetalFoldUpChairTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/metalfoldupchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MetalFoldUpChairTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldoutchair.png");
	}
}
