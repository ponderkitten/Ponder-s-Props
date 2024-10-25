package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ClawMachineFailTileEntity;

public class ClawMachineFailBlockModel extends AnimatedGeoModel<ClawMachineFailTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineFailTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/clawmachinefail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineFailTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/clawmachinefail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineFailTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/clawmachine.png");
	}
}
