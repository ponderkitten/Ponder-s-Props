package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.DrainWaterDisplayItem;

public class DrainWaterDisplayModel extends AnimatedGeoModel<DrainWaterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrainWaterDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainWaterDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainWaterDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainwater.png");
	}
}
