package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.BoxCutterBlockTileEntity;

public class BoxCutterBlockBlockModel extends AnimatedGeoModel<BoxCutterBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxCutterBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/boxcutterblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxCutterBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/boxcutterblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxCutterBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/boxcutterblock.png");
	}
}
