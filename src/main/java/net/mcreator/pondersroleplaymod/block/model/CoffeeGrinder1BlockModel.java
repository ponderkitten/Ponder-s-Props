package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder1TileEntity;

public class CoffeeGrinder1BlockModel extends AnimatedGeoModel<CoffeeGrinder1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder1TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder1.png");
	}
}
