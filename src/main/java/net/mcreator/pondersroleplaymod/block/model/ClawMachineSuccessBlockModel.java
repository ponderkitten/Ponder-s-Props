package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ClawMachineSuccessTileEntity;

public class ClawMachineSuccessBlockModel extends AnimatedGeoModel<ClawMachineSuccessTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineSuccessTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/clawmachinesuccess.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineSuccessTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/clawmachinesuccess.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineSuccessTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/clawmachine.png");
	}
}
