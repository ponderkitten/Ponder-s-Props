package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CashRegisterCardTileEntity;

public class CashRegisterCardBlockModel extends AnimatedGeoModel<CashRegisterCardTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CashRegisterCardTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/cashregistercard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CashRegisterCardTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/cashregistercard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CashRegisterCardTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cashregister.png");
	}
}
