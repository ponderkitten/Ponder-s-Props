package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.DrainBloodDisplayItem;

public class DrainBloodDisplayModel extends AnimatedGeoModel<DrainBloodDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrainBloodDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainBloodDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainBloodDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainblood.png");
	}
}
