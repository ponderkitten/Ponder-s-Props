package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CashRegisterClosedTileEntity;

public class CashRegisterClosedBlockModel extends AnimatedGeoModel<CashRegisterClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CashRegisterClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/cashregisterclosed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CashRegisterClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/cashregisterclosed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CashRegisterClosedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cashregister.png");
	}
}
