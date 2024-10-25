package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FrenchPress2TileEntity;

public class FrenchPress2BlockModel extends AnimatedGeoModel<FrenchPress2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpress.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpress.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpressdry.png");
	}
}
