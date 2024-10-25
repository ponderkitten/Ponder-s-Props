package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FlashlightBlockOffTileEntity;

public class FlashlightBlockOffBlockModel extends AnimatedGeoModel<FlashlightBlockOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlashlightBlockOffTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/flashlightblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlashlightBlockOffTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/flashlightblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlashlightBlockOffTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/flashlightblockoff.png");
	}
}
