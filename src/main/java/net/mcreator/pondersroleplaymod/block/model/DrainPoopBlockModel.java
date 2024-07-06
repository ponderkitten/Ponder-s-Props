package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.DrainPoopTileEntity;

public class DrainPoopBlockModel extends AnimatedGeoModel<DrainPoopTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrainPoopTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainPoopTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainPoopTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainpoop.png");
	}
}
