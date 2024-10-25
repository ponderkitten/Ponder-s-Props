package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballTowerPinkTileEntity;

public class GumballTowerPinkBlockModel extends AnimatedGeoModel<GumballTowerPinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballTowerPinkTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballTowerPinkTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballTowerPinkTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumtowerpink.png");
	}
}
