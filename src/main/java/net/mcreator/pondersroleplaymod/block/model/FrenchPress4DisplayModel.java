package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FrenchPress4DisplayItem;

public class FrenchPress4DisplayModel extends AnimatedGeoModel<FrenchPress4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpressed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress4DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpressed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress4DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpressed.png");
	}
}
