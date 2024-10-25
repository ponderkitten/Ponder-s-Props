package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FoldedUpTableDisplayItem;

public class FoldedUpTableDisplayModel extends AnimatedGeoModel<FoldedUpTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoldedUpTableDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/foldeduptable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoldedUpTableDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/foldeduptable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoldedUpTableDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldeduptable.png");
	}
}
