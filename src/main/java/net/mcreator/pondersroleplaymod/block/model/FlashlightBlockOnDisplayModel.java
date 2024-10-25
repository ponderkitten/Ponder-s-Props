package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FlashlightBlockOnDisplayItem;

public class FlashlightBlockOnDisplayModel extends AnimatedGeoModel<FlashlightBlockOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FlashlightBlockOnDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/flashlightblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlashlightBlockOnDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/flashlightblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlashlightBlockOnDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/flashlightblockon.png");
	}
}
