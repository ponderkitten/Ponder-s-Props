package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TapeBlockTileEntity;

public class TapeBlockBlockModel extends AnimatedGeoModel<TapeBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TapeBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/packingtapeblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TapeBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/packingtapeblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TapeBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/packingtapeblock.png");
	}
}
