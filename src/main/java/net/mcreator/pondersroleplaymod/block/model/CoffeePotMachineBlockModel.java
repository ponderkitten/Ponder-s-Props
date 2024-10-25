package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachineTileEntity;

public class CoffeePotMachineBlockModel extends AnimatedGeoModel<CoffeePotMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachineTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine1.png");
	}
}
