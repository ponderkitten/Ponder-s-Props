package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.MetalFoldedUpChairStackDisplayItem;

public class MetalFoldedUpChairStackDisplayModel extends AnimatedGeoModel<MetalFoldedUpChairStackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MetalFoldedUpChairStackDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/metalfoldedupchairstack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MetalFoldedUpChairStackDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/metalfoldedupchairstack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MetalFoldedUpChairStackDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldoutchair.png");
	}
}
