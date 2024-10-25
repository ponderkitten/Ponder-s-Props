package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ChairDisplayItem;

public class ChairDisplayModel extends AnimatedGeoModel<ChairDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChairDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/chairout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChairDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/chairout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChairDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
