package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PowerDrillBlockStandingDisplayItem;

public class PowerDrillBlockStandingDisplayModel extends AnimatedGeoModel<PowerDrillBlockStandingDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PowerDrillBlockStandingDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/powerdrillstandingblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PowerDrillBlockStandingDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/powerdrillstandingblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PowerDrillBlockStandingDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/powerdrillblock.png");
	}
}
