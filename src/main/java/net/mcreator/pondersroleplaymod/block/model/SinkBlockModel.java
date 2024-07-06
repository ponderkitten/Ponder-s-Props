package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.SinkTileEntity;

public class SinkBlockModel extends AnimatedGeoModel<SinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SinkTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SinkTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SinkTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/sink.png");
	}
}
