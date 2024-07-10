package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates3TileEntity;

public class Plates3BlockModel extends AnimatedGeoModel<Plates3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack3.png");
	}
}
