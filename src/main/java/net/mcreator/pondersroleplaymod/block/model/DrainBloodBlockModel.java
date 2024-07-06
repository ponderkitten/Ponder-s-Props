package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.DrainBloodTileEntity;

public class DrainBloodBlockModel extends AnimatedGeoModel<DrainBloodTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrainBloodTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainBloodTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainBloodTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainblood.png");
	}
}
