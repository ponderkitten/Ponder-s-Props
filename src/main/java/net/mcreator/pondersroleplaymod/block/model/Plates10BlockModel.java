package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates10TileEntity;

public class Plates10BlockModel extends AnimatedGeoModel<Plates10TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates10TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates10TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates10TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack10.png");
	}
}
