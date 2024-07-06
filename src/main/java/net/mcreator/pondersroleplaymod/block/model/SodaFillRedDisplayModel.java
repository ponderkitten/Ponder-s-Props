package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SodaFillRedDisplayItem;

public class SodaFillRedDisplayModel extends AnimatedGeoModel<SodaFillRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SodaFillRedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodadispenser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SodaFillRedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodadispenser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SodaFillRedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/dispensorredfill.png");
	}
}
