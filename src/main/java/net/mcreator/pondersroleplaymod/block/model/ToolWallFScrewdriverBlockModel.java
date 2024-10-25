package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolWallFScrewdriverTileEntity;

public class ToolWallFScrewdriverBlockModel extends AnimatedGeoModel<ToolWallFScrewdriverTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallFScrewdriverTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallFScrewdriverTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallFScrewdriverTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallfscredriver.png");
	}
}
