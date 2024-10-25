package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.SkeeBallGoalDisplayItem;

public class SkeeBallGoalDisplayModel extends AnimatedGeoModel<SkeeBallGoalDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SkeeBallGoalDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/skeeballgoal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeBallGoalDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/skeeballgoal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeBallGoalDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/skeeballgoal.png");
	}
}
