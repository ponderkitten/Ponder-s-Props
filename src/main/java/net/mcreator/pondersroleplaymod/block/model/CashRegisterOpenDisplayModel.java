package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CashRegisterOpenDisplayItem;

public class CashRegisterOpenDisplayModel extends AnimatedGeoModel<CashRegisterOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CashRegisterOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/cashregisteropen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CashRegisterOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/cashregisteropen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CashRegisterOpenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cashregister.png");
	}
}
