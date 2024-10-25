package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeMakerTileEntity;

public class CoffeeMakerBlockModel extends AnimatedGeoModel<CoffeeMakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeMakerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeMakerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeMakerTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeemakerempty.png");
	}
}
