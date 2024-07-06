package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SodaFillRedTileEntity;

public class SodaFillRedBlockModel extends AnimatedGeoModel<SodaFillRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillRedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillRedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillRedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensorredfill.png");
	}
}
