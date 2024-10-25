package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachine4TileEntity;

public class CoffeePotMachine4BlockModel extends AnimatedGeoModel<CoffeePotMachine4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachine4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachine4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachine4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine3.png");
	}
}
