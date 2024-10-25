package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.HomeDepotBoxOpenTileEntity;

public class HomeDepotBoxOpenBlockModel extends AnimatedGeoModel<HomeDepotBoxOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HomeDepotBoxOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/homedepotbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HomeDepotBoxOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/homedepotbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HomeDepotBoxOpenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/homedepotboxopen.png");
	}
}
