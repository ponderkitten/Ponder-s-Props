package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TrashbinStage1TileEntity;

public class TrashbinStage1BlockModel extends AnimatedGeoModel<TrashbinStage1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashbinStage1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bintrash1-4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashbinStage1TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bintrash1-4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashbinStage1TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
