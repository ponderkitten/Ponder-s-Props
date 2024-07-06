package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SodaFillGreenTileEntity;

public class SodaFillGreenBlockModel extends AnimatedGeoModel<SodaFillGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillGreenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillGreenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillGreenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensorgreenfill.png");
	}
}
