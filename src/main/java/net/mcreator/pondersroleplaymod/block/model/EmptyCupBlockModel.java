package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.EmptyCupTileEntity;

public class EmptyCupBlockModel extends AnimatedGeoModel<EmptyCupTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EmptyCupTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeecup.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyCupTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeecup.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyCupTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/emptycoffeecup.png");
	}
}
