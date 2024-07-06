package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.DrainPeeTileEntity;

public class DrainPeeBlockModel extends AnimatedGeoModel<DrainPeeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrainPeeTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainPeeTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainPeeTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainpee.png");
	}
}
