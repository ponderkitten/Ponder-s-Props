package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ClosedNoteTileEntity;

public class ClosedNoteBlockModel extends AnimatedGeoModel<ClosedNoteTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClosedNoteTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/blankpapersign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClosedNoteTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/blankpapersign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClosedNoteTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/closedindefinitely.png");
	}
}
