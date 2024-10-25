package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.MetalFoldUpChairDisplayItem;

public class MetalFoldUpChairDisplayModel extends AnimatedGeoModel<MetalFoldUpChairDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MetalFoldUpChairDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/metalfoldupchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MetalFoldUpChairDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/metalfoldupchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MetalFoldUpChairDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/foldoutchair.png");
	}
}
