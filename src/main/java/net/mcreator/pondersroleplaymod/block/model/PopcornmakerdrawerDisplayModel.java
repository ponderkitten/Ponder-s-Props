package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornmakerdrawerDisplayItem;

public class PopcornmakerdrawerDisplayModel extends AnimatedGeoModel<PopcornmakerdrawerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornmakerdrawerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornbottomdrawer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornmakerdrawerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornbottomdrawer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornmakerdrawerDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakerdrawer.png");
	}
}
