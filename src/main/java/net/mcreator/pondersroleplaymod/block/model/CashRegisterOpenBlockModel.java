package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CashRegisterOpenTileEntity;

public class CashRegisterOpenBlockModel extends AnimatedGeoModel<CashRegisterOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CashRegisterOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/cashregisteropen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CashRegisterOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/cashregisteropen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CashRegisterOpenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cashregister.png");
	}
}
