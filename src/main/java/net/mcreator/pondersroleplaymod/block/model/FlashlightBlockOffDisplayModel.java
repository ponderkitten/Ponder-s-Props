package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FlashlightBlockOffDisplayItem;

public class FlashlightBlockOffDisplayModel extends AnimatedGeoModel<FlashlightBlockOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FlashlightBlockOffDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/flashlightblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlashlightBlockOffDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/flashlightblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlashlightBlockOffDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/flashlightblockoff.png");
	}
}
