package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PlatesTileEntity;

public class PlatesBlockModel extends AnimatedGeoModel<PlatesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlatesTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlatesTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlatesTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack1.png");
	}
}
