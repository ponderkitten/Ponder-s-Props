package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ATMTileEntity;

public class ATMBlockModel extends AnimatedGeoModel<ATMTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ATMTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/atmmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ATMTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/atmmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ATMTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/wallatmmachine.png");
	}
}
