package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PlatesDisplayItem;

public class PlatesDisplayModel extends AnimatedGeoModel<PlatesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PlatesDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlatesDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlatesDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack1.png");
	}
}
