package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ChairTileEntity;

public class ChairBlockModel extends AnimatedGeoModel<ChairTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChairTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/chairout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChairTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/chairout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChairTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
