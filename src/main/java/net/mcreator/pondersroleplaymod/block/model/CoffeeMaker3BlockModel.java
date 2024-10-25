package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeMaker3TileEntity;

public class CoffeeMaker3BlockModel extends AnimatedGeoModel<CoffeeMaker3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeMaker3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeMaker3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeMaker3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeemakerpouring.png");
	}
}
