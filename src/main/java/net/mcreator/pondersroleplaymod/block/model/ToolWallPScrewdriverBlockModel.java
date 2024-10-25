package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolWallPScrewdriverTileEntity;

public class ToolWallPScrewdriverBlockModel extends AnimatedGeoModel<ToolWallPScrewdriverTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallPScrewdriverTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallPScrewdriverTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallPScrewdriverTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallpscrewdriver.png");
	}
}
