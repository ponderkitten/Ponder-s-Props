package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TrashBinStage3TileEntity;

public class TrashBinStage3BlockModel extends AnimatedGeoModel<TrashBinStage3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinStage3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bintrash3-4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinStage3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bintrash3-4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinStage3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
