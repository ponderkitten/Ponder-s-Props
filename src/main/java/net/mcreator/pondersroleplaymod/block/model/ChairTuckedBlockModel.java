package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ChairTuckedTileEntity;

public class ChairTuckedBlockModel extends AnimatedGeoModel<ChairTuckedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChairTuckedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/chairtucked.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChairTuckedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/chairtucked.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChairTuckedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
