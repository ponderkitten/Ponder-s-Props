package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FlashlightBlockOnTileEntity;

public class FlashlightBlockOnBlockModel extends AnimatedGeoModel<FlashlightBlockOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlashlightBlockOnTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/flashlightblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlashlightBlockOnTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/flashlightblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlashlightBlockOnTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/flashlightblockon.png");
	}
}
