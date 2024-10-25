package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeeGrinder3TileEntity;

public class CoffeeGrinder3BlockModel extends AnimatedGeoModel<CoffeeGrinder3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeeGrinder3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeegrinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeeGrinder3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeegrinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeeGrinder3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeegrinder3.png");
	}
}
