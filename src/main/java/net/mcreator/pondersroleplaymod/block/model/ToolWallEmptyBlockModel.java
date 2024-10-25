package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolWallEmptyTileEntity;

public class ToolWallEmptyBlockModel extends AnimatedGeoModel<ToolWallEmptyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallEmptyTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallEmptyTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallEmptyTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallempty.png");
	}
}
