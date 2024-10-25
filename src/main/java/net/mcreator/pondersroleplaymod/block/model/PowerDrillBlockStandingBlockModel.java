package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PowerDrillBlockStandingTileEntity;

public class PowerDrillBlockStandingBlockModel extends AnimatedGeoModel<PowerDrillBlockStandingTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PowerDrillBlockStandingTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/powerdrillstandingblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PowerDrillBlockStandingTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/powerdrillstandingblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PowerDrillBlockStandingTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/powerdrillblock.png");
	}
}
