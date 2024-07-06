package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TrashBagBoxOpenTileEntity;

public class TrashBagBoxOpenBlockModel extends AnimatedGeoModel<TrashBagBoxOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagBoxOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trashbagbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagBoxOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trashbagbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagBoxOpenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/opntrashbagbox.png");
	}
}
