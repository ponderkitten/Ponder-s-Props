package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolDrawerTileEntity;

public class ToolDrawerBlockModel extends AnimatedGeoModel<ToolDrawerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolDrawerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tooldrawer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolDrawerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tooldrawer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolDrawerTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tooldrawer.png");
	}
}
