package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.HammerBlockDisplayItem;

public class HammerBlockDisplayModel extends AnimatedGeoModel<HammerBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HammerBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/hammerblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HammerBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/hammerblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HammerBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/hammerblock.png");
	}
}
