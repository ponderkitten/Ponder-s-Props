package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.DrainPeeDisplayItem;

public class DrainPeeDisplayModel extends AnimatedGeoModel<DrainPeeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrainPeeDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/drain.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrainPeeDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/drain.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrainPeeDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/drainpee.png");
	}
}
