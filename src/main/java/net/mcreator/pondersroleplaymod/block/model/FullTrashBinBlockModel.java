package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FullTrashBinTileEntity;

public class FullTrashBinBlockModel extends AnimatedGeoModel<FullTrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FullTrashBinTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FullTrashBinTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FullTrashBinTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
