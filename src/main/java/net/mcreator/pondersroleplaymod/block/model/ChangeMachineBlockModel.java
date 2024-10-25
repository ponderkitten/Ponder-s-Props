package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ChangeMachineTileEntity;

public class ChangeMachineBlockModel extends AnimatedGeoModel<ChangeMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChangeMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/changemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChangeMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/changemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChangeMachineTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/changemachinetop.png");
	}
}
