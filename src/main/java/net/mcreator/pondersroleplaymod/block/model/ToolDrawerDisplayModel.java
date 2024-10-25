package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolDrawerDisplayItem;

public class ToolDrawerDisplayModel extends AnimatedGeoModel<ToolDrawerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolDrawerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tooldrawer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolDrawerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tooldrawer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolDrawerDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tooldrawer.png");
	}
}
