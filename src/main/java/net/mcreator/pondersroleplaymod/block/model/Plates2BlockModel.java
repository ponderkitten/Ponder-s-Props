package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates2TileEntity;

public class Plates2BlockModel extends AnimatedGeoModel<Plates2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack2.png");
	}
}
