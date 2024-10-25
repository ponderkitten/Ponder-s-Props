package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CoffeePotMachine3TileEntity;

public class CoffeePotMachine3BlockModel extends AnimatedGeoModel<CoffeePotMachine3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffeePotMachine3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeepotmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffeePotMachine3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeepotmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffeePotMachine3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/coffeepotmachine4.png");
	}
}
