package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.MetalFoldedUpChairStackTileEntity;

public class MetalFoldedUpChairStackBlockModel extends AnimatedGeoModel<MetalFoldedUpChairStackTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MetalFoldedUpChairStackTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/metalfoldedupchairstack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MetalFoldedUpChairStackTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/metalfoldedupchairstack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MetalFoldedUpChairStackTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldoutchair.png");
	}
}
