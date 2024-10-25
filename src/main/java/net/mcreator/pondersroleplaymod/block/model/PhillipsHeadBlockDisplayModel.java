package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PhillipsHeadBlockDisplayItem;

public class PhillipsHeadBlockDisplayModel extends AnimatedGeoModel<PhillipsHeadBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PhillipsHeadBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/screwdriverblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PhillipsHeadBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/screwdriverblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PhillipsHeadBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/phillipsblock.png");
	}
}
