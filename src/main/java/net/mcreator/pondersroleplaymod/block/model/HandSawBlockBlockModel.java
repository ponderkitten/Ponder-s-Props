package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.HandSawBlockTileEntity;

public class HandSawBlockBlockModel extends AnimatedGeoModel<HandSawBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HandSawBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/handsawblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HandSawBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/handsawblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HandSawBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/handsawblock.png");
	}
}
