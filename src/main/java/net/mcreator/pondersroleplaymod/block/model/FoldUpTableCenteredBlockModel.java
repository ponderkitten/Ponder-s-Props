package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FoldUpTableCenteredTileEntity;

public class FoldUpTableCenteredBlockModel extends AnimatedGeoModel<FoldUpTableCenteredTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoldUpTableCenteredTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/folduptablecentered.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoldUpTableCenteredTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/folduptablecentered.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoldUpTableCenteredTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/folduptableredmatt.png");
	}
}
