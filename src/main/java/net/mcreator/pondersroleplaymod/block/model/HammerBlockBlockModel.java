package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.HammerBlockTileEntity;

public class HammerBlockBlockModel extends AnimatedGeoModel<HammerBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HammerBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/hammerblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HammerBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/hammerblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HammerBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/hammerblock.png");
	}
}
