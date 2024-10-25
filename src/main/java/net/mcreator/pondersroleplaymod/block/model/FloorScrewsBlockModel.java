package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FloorScrewsTileEntity;

public class FloorScrewsBlockModel extends AnimatedGeoModel<FloorScrewsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FloorScrewsTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/floorscrews.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloorScrewsTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/floorscrews.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloorScrewsTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/screwpile.png");
	}
}
