package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PopcornButterMachineTileEntity;

public class PopcornButterMachineBlockModel extends AnimatedGeoModel<PopcornButterMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopcornButterMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornbutter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornButterMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornbutter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornButterMachineTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornbuttermachine.png");
	}
}
