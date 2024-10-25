package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.HomeDepotBoxClosedDisplayItem;

public class HomeDepotBoxClosedDisplayModel extends AnimatedGeoModel<HomeDepotBoxClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HomeDepotBoxClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/homedepotbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HomeDepotBoxClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/homedepotbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HomeDepotBoxClosedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/homedepotboxclosed.png");
	}
}
