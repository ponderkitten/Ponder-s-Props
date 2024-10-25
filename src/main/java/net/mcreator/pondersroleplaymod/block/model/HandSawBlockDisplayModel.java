package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.HandSawBlockDisplayItem;

public class HandSawBlockDisplayModel extends AnimatedGeoModel<HandSawBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HandSawBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/handsawblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HandSawBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/handsawblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HandSawBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/handsawblock.png");
	}
}
