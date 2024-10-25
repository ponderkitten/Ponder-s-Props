package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FrenchPress1DisplayItem;

public class FrenchPress1DisplayModel extends AnimatedGeoModel<FrenchPress1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpress.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpress.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress1DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpress.png");
	}
}
