package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.DrainWaterTileEntity;

public class DrainWaterBlockModel extends AnimatedGeoModel<DrainWaterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrainWaterTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainWaterTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainWaterTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainwater.png");
	}
}
