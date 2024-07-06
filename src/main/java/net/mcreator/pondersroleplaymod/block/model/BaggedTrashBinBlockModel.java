package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.BaggedTrashBinTileEntity;

public class BaggedTrashBinBlockModel extends AnimatedGeoModel<BaggedTrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BaggedTrashBinTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggedTrashBinTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggedTrashBinTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/empty_trash_bin.png");
	}
}
