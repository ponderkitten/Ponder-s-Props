package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates7TileEntity;

public class Plates7BlockModel extends AnimatedGeoModel<Plates7TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates7TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates7TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates7TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack7.png");
	}
}
