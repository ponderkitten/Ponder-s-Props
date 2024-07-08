package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WoodenBoards2DisplayItem;

public class WoodenBoards2DisplayModel extends AnimatedGeoModel<WoodenBoards2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBoards2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wooden_boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBoards2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wooden_boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBoards2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/board2.png");
	}
}
