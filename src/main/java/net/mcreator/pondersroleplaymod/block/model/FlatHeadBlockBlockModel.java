package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FlatHeadBlockTileEntity;

public class FlatHeadBlockBlockModel extends AnimatedGeoModel<FlatHeadBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlatHeadBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/screwdriverblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlatHeadBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/screwdriverblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlatHeadBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/flatheadblock.png");
	}
}
