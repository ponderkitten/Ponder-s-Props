package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallBoxCutterDisplayItem;

public class ToolWallBoxCutterDisplayModel extends AnimatedGeoModel<ToolWallBoxCutterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallBoxCutterDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallBoxCutterDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallBoxCutterDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallboxcutter.png");
	}
}
