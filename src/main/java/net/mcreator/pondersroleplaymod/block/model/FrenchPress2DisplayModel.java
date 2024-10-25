package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FrenchPress2DisplayItem;

public class FrenchPress2DisplayModel extends AnimatedGeoModel<FrenchPress2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpress.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpress.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpressdry.png");
	}
}
