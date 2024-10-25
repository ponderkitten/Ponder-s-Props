package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.HomeDepotBoxClosedTileEntity;

public class HomeDepotBoxClosedBlockModel extends AnimatedGeoModel<HomeDepotBoxClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HomeDepotBoxClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/homedepotbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HomeDepotBoxClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/homedepotbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HomeDepotBoxClosedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/homedepotboxclosed.png");
	}
}
