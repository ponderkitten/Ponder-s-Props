package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallPScrewdriverDisplayItem;

public class ToolWallPScrewdriverDisplayModel extends AnimatedGeoModel<ToolWallPScrewdriverDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallPScrewdriverDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallPScrewdriverDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallPScrewdriverDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallpscrewdriver.png");
	}
}