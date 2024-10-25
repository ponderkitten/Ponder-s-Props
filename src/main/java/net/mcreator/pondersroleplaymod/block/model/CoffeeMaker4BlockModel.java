package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeMaker4TileEntity;

public class CoffeeMaker4BlockModel extends AnimatedGeoModel<CoffeeMaker4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeMaker4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeMaker4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeMaker4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeemakerready.png");
	}
}
