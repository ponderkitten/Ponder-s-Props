package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FrenchPress3DisplayItem;

public class FrenchPress3DisplayModel extends AnimatedGeoModel<FrenchPress3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpress.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpress.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpresssteeping.png");
	}
}
