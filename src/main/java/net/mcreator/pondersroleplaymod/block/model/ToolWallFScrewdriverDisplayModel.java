package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallFScrewdriverDisplayItem;

public class ToolWallFScrewdriverDisplayModel extends AnimatedGeoModel<ToolWallFScrewdriverDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallFScrewdriverDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallFScrewdriverDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallFScrewdriverDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallfscredriver.png");
	}
}
