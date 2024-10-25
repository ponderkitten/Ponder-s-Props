package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PowerDrillBlockTileEntity;

public class PowerDrillBlockBlockModel extends AnimatedGeoModel<PowerDrillBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PowerDrillBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/powerdrillblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PowerDrillBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/powerdrillblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PowerDrillBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/powerdrillblock.png");
	}
}
