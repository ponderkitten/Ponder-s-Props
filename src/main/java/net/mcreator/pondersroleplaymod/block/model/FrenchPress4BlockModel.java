package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FrenchPress4TileEntity;

public class FrenchPress4BlockModel extends AnimatedGeoModel<FrenchPress4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpressed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress4TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpressed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress4TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpressed.png");
	}
}
