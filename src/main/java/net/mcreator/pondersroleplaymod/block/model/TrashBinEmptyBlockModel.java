package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TrashBinEmptyTileEntity;

public class TrashBinEmptyBlockModel extends AnimatedGeoModel<TrashBinEmptyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinEmptyTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinEmptyTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinEmptyTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/bagged_trash_bin.png");
	}
}
