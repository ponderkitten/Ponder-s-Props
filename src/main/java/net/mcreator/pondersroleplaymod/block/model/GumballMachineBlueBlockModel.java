package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballMachineBlueTileEntity;

public class GumballMachineBlueBlockModel extends AnimatedGeoModel<GumballMachineBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballMachineBlueTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballMachineBlueTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballMachineBlueTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballblue.png");
	}
}
