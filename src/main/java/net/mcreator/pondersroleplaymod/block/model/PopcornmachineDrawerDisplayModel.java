package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornmachineDrawerDisplayItem;

public class PopcornmachineDrawerDisplayModel extends AnimatedGeoModel<PopcornmachineDrawerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornmachineDrawerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornbottomdrawer2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornmachineDrawerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornbottomdrawer2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornmachineDrawerDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakerdrawer.png");
	}
}
