package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TrashbinStage2TileEntity;

public class TrashbinStage2BlockModel extends AnimatedGeoModel<TrashbinStage2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashbinStage2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bintrash2-4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashbinStage2TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bintrash2-4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashbinStage2TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
