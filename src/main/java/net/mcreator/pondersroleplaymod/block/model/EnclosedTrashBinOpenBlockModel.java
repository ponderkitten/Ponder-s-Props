package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinOpenTileEntity;

public class EnclosedTrashBinOpenBlockModel extends AnimatedGeoModel<EnclosedTrashBinOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbinopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbinopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinOpenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbinfull.png");
	}
}
