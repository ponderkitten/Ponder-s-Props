package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SinkDisplayItem;

public class SinkDisplayModel extends AnimatedGeoModel<SinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SinkDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SinkDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SinkDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/sink.png");
	}
}
