package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ToolWallMonkeyWrenchDisplayItem;

public class ToolWallMonkeyWrenchDisplayModel extends AnimatedGeoModel<ToolWallMonkeyWrenchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallMonkeyWrenchDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallMonkeyWrenchDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallMonkeyWrenchDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallmonkeywrench.png");
	}
}
