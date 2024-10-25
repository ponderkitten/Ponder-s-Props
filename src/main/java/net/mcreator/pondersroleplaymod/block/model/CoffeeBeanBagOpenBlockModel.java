package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeBeanBagOpenTileEntity;

public class CoffeeBeanBagOpenBlockModel extends AnimatedGeoModel<CoffeeBeanBagOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeBeanBagOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeebeanbagopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeBeanBagOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeebeanbagopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeBeanBagOpenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeebeanbagopen.png");
	}
}
