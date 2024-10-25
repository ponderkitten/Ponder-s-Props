package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CashRegisterCardDisplayItem;

public class CashRegisterCardDisplayModel extends AnimatedGeoModel<CashRegisterCardDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CashRegisterCardDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/cashregistercard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CashRegisterCardDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/cashregistercard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CashRegisterCardDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cashregister.png");
	}
}
