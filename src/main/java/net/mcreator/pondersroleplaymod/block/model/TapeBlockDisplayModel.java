package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TapeBlockDisplayItem;

public class TapeBlockDisplayModel extends AnimatedGeoModel<TapeBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TapeBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/packingtapeblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TapeBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/packingtapeblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TapeBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/packingtapeblock.png");
	}
}
