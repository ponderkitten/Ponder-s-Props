package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WoodenBoards1DisplayItem;

public class WoodenBoards1DisplayModel extends AnimatedGeoModel<WoodenBoards1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBoards1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wooden_boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBoards1DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wooden_boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBoards1DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/board1.png");
	}
}
