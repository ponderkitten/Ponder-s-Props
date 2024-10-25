package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeCupTileEntity;

public class CoffeeCupBlockModel extends AnimatedGeoModel<CoffeeCupTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeCupTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeecup.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeCupTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeecup.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeCupTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeecup.png");
	}
}
