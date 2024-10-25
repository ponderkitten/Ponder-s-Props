package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.MetalFoldedUpChairDisplayItem;

public class MetalFoldedUpChairDisplayModel extends AnimatedGeoModel<MetalFoldedUpChairDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MetalFoldedUpChairDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/metalfoldedupchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MetalFoldedUpChairDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/metalfoldedupchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MetalFoldedUpChairDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldoutchair.png");
	}
}
