package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.HomeDepotBoxOpenDisplayItem;

public class HomeDepotBoxOpenDisplayModel extends AnimatedGeoModel<HomeDepotBoxOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HomeDepotBoxOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/homedepotbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HomeDepotBoxOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/homedepotbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HomeDepotBoxOpenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/homedepotboxopen.png");
	}
}
