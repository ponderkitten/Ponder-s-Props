package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachine2TileEntity;

public class CoffeePotMachine2BlockModel extends AnimatedGeoModel<CoffeePotMachine2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachine2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachine2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachine2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine2.png");
	}
}
