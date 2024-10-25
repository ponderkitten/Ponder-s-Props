package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.MonkeyWrenchBlockTileEntity;

public class MonkeyWrenchBlockBlockModel extends AnimatedGeoModel<MonkeyWrenchBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MonkeyWrenchBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/wrenchblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MonkeyWrenchBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/wrenchblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MonkeyWrenchBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/wrenchblock.png");
	}
}
