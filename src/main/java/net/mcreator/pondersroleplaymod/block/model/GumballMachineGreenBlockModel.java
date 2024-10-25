package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballMachineGreenTileEntity;

public class GumballMachineGreenBlockModel extends AnimatedGeoModel<GumballMachineGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballMachineGreenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballMachineGreenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballMachineGreenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballgreen.png");
	}
}
