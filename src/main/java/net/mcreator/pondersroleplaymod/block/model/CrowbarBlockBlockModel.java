package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CrowbarBlockTileEntity;

public class CrowbarBlockBlockModel extends AnimatedGeoModel<CrowbarBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrowbarBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/crowbarblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrowbarBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/crowbarblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrowbarBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/crowbarblock.png");
	}
}
