package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WoodenBoards3TileEntity;

public class WoodenBoards3BlockModel extends AnimatedGeoModel<WoodenBoards3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBoards3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wooden_boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBoards3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wooden_boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBoards3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/board3.png");
	}
}
