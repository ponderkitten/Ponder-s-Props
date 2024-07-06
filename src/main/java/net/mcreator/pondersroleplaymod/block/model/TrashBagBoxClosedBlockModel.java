package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TrashBagBoxClosedTileEntity;

public class TrashBagBoxClosedBlockModel extends AnimatedGeoModel<TrashBagBoxClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagBoxClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trashbagbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagBoxClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trashbagbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagBoxClosedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/closedtrashbagbox.png");
	}
}
