package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PopcornmakerdrawerTileEntity;

public class PopcornmakerdrawerBlockModel extends AnimatedGeoModel<PopcornmakerdrawerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopcornmakerdrawerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornbottomdrawer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornmakerdrawerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornbottomdrawer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornmakerdrawerTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakerdrawer.png");
	}
}
