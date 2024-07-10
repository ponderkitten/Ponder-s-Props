package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.Plates11TileEntity;

public class Plates11BlockModel extends AnimatedGeoModel<Plates11TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Plates11TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/platestack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Plates11TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/platestack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Plates11TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/platestack11.png");
	}
}
