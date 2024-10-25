package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FoldUpTableTileEntity;

public class FoldUpTableBlockModel extends AnimatedGeoModel<FoldUpTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoldUpTableTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/folduptable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoldUpTableTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/folduptable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoldUpTableTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/folduptableredmatt.png");
	}
}
