package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ATMDisplayItem;

public class ATMDisplayModel extends AnimatedGeoModel<ATMDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ATMDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/atmmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ATMDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/atmmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ATMDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/wallatmmachine.png");
	}
}
