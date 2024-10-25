package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.MonkeyWrenchBlockDisplayItem;

public class MonkeyWrenchBlockDisplayModel extends AnimatedGeoModel<MonkeyWrenchBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MonkeyWrenchBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wrenchblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MonkeyWrenchBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wrenchblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MonkeyWrenchBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/wrenchblock.png");
	}
}
