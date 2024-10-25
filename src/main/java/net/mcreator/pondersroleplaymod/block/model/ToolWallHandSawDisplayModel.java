package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallHandSawDisplayItem;

public class ToolWallHandSawDisplayModel extends AnimatedGeoModel<ToolWallHandSawDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallHandSawDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallHandSawDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallHandSawDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallhandsaw.png");
	}
}
