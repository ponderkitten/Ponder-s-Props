package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallHammerDisplayItem;

public class ToolWallHammerDisplayModel extends AnimatedGeoModel<ToolWallHammerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallHammerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallHammerDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallHammerDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallhammer.png");
	}
}
