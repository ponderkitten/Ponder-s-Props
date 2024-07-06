package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.DrainTileEntity;

public class DrainBlockModel extends AnimatedGeoModel<DrainTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrainTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drain.png");
	}
}
