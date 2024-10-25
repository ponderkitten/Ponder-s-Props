package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CrowbarBlockDisplayItem;

public class CrowbarBlockDisplayModel extends AnimatedGeoModel<CrowbarBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CrowbarBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/crowbarblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrowbarBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/crowbarblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrowbarBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/crowbarblock.png");
	}
}
