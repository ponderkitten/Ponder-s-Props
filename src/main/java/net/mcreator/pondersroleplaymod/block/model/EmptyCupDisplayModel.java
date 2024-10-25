package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.EmptyCupDisplayItem;

public class EmptyCupDisplayModel extends AnimatedGeoModel<EmptyCupDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyCupDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/coffeecup.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyCupDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/coffeecup.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyCupDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/emptycoffeecup.png");
	}
}
