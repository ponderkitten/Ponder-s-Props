package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FloorScrewsDisplayItem;

public class FloorScrewsDisplayModel extends AnimatedGeoModel<FloorScrewsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FloorScrewsDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/floorscrews.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloorScrewsDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/floorscrews.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloorScrewsDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/screwpile.png");
	}
}
