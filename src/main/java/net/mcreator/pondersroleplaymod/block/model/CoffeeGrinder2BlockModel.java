package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder2TileEntity;

public class CoffeeGrinder2BlockModel extends AnimatedGeoModel<CoffeeGrinder2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder2.png");
	}
}
