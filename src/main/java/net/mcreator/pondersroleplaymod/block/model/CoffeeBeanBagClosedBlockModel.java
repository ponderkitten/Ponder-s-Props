package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeBeanBagClosedTileEntity;

public class CoffeeBeanBagClosedBlockModel extends AnimatedGeoModel<CoffeeBeanBagClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeBeanBagClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeebeanbagclosed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeBeanBagClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeebeanbagclosed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeBeanBagClosedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeebeanbagclosed.png");
	}
}
