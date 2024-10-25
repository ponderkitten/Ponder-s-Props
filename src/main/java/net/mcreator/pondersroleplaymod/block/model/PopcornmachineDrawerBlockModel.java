package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PopcornmachineDrawerTileEntity;

public class PopcornmachineDrawerBlockModel extends AnimatedGeoModel<PopcornmachineDrawerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopcornmachineDrawerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornbottomdrawer2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornmachineDrawerTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornbottomdrawer2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornmachineDrawerTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmakerdrawer.png");
	}
}
