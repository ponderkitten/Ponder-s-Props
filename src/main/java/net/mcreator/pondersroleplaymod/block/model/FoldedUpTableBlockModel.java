package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FoldedUpTableTileEntity;

public class FoldedUpTableBlockModel extends AnimatedGeoModel<FoldedUpTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoldedUpTableTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/foldeduptable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoldedUpTableTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/foldeduptable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoldedUpTableTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldeduptable.png");
	}
}
