package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinTileEntity;

public class EnclosedTrashBinBlockModel extends AnimatedGeoModel<EnclosedTrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbin.png");
	}
}
