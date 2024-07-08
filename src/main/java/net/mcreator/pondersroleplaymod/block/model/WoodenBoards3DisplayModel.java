package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WoodenBoards3DisplayItem;

public class WoodenBoards3DisplayModel extends AnimatedGeoModel<WoodenBoards3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBoards3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wooden_boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBoards3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wooden_boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBoards3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/board3.png");
	}
}
