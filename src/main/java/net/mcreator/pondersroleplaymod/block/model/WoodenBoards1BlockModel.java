package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WoodenBoards1TileEntity;

public class WoodenBoards1BlockModel extends AnimatedGeoModel<WoodenBoards1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBoards1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wooden_boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBoards1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wooden_boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBoards1TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/board1.png");
	}
}
