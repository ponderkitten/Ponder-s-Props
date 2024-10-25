package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PickleJarClosedTileEntity;

public class PickleJarClosedBlockModel extends AnimatedGeoModel<PickleJarClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PickleJarClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/picklejar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PickleJarClosedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/picklejar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PickleJarClosedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/picklejar.png");
	}
}
