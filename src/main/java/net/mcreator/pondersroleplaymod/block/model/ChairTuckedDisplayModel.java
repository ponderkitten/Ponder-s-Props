package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ChairTuckedDisplayItem;

public class ChairTuckedDisplayModel extends AnimatedGeoModel<ChairTuckedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChairTuckedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/chairtucked.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChairTuckedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/chairtucked.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChairTuckedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
