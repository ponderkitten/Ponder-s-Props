package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FlatHeadBlockDisplayItem;

public class FlatHeadBlockDisplayModel extends AnimatedGeoModel<FlatHeadBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FlatHeadBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/screwdriverblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlatHeadBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/screwdriverblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlatHeadBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/flatheadblock.png");
	}
}
