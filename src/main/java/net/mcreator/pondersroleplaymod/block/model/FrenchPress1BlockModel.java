package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FrenchPress1TileEntity;

public class FrenchPress1BlockModel extends AnimatedGeoModel<FrenchPress1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpress.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpress.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress1TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpress.png");
	}
}
