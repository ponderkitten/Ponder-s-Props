package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PowerDrillBlockDisplayItem;

public class PowerDrillBlockDisplayModel extends AnimatedGeoModel<PowerDrillBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PowerDrillBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/powerdrillblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PowerDrillBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/powerdrillblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PowerDrillBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/powerdrillblock.png");
	}
}
