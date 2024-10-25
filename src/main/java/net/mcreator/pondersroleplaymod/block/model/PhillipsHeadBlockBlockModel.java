package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PhillipsHeadBlockTileEntity;

public class PhillipsHeadBlockBlockModel extends AnimatedGeoModel<PhillipsHeadBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PhillipsHeadBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/screwdriverblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PhillipsHeadBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/screwdriverblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PhillipsHeadBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/phillipsblock.png");
	}
}
