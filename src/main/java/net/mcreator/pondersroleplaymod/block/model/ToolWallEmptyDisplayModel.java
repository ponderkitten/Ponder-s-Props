package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallEmptyDisplayItem;

public class ToolWallEmptyDisplayModel extends AnimatedGeoModel<ToolWallEmptyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallEmptyDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallEmptyDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallEmptyDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallempty.png");
	}
}
