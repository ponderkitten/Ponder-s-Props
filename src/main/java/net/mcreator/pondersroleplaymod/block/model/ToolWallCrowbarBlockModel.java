package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolWallCrowbarTileEntity;

public class ToolWallCrowbarBlockModel extends AnimatedGeoModel<ToolWallCrowbarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallCrowbarTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallCrowbarTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallCrowbarTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallcrowbar.png");
	}
}
