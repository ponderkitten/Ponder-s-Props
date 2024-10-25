package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SkeeBallBaseTileEntity;

public class SkeeBallBaseBlockModel extends AnimatedGeoModel<SkeeBallBaseTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkeeBallBaseTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/skeeballbase.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeBallBaseTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/skeeballbase.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeBallBaseTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/skeeballbase.png");
	}
}
