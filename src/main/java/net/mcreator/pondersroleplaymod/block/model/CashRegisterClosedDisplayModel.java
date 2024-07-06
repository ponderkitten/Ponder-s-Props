package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CashRegisterClosedDisplayItem;

public class CashRegisterClosedDisplayModel extends AnimatedGeoModel<CashRegisterClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CashRegisterClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/cashregisterclosed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CashRegisterClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/cashregisterclosed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CashRegisterClosedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cashregister.png");
	}
}
