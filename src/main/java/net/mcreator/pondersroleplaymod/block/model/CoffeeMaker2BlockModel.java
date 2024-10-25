package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeMaker2TileEntity;

public class CoffeeMaker2BlockModel extends AnimatedGeoModel<CoffeeMaker2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeMaker2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeMaker2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeMaker2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeemakeremptycup.png");
	}
}
