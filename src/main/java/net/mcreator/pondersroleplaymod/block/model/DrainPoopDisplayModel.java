package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.DrainPoopDisplayItem;

public class DrainPoopDisplayModel extends AnimatedGeoModel<DrainPoopDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrainPoopDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainPoopDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainPoopDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainpoop.png");
	}
}
