package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WoodenBoards2TileEntity;

public class WoodenBoards2BlockModel extends AnimatedGeoModel<WoodenBoards2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBoards2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wooden_boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBoards2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wooden_boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBoards2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/board2.png");
	}
}
