package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder4TileEntity;

public class CoffeeGrinder4BlockModel extends AnimatedGeoModel<CoffeeGrinder4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder4.png");
	}
}
