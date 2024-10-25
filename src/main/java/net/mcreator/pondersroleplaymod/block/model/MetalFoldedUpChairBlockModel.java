package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.MetalFoldedUpChairTileEntity;

public class MetalFoldedUpChairBlockModel extends AnimatedGeoModel<MetalFoldedUpChairTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MetalFoldedUpChairTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/metalfoldedupchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MetalFoldedUpChairTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/metalfoldedupchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MetalFoldedUpChairTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldoutchair.png");
	}
}
