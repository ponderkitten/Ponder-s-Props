package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ClawMachineTileEntity;

public class ClawMachineBlockModel extends AnimatedGeoModel<ClawMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/clawmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/clawmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/clawmachine.png");
	}
}
