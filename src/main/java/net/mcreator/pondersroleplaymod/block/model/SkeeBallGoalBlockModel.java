package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SkeeBallGoalTileEntity;

public class SkeeBallGoalBlockModel extends AnimatedGeoModel<SkeeBallGoalTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkeeBallGoalTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/skeeballgoal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeBallGoalTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/skeeballgoal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeBallGoalTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/skeeballgoal.png");
	}
}
