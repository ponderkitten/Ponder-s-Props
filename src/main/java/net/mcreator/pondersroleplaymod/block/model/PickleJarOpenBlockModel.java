package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PickleJarOpenTileEntity;

public class PickleJarOpenBlockModel extends AnimatedGeoModel<PickleJarOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PickleJarOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/picklejar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PickleJarOpenTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/picklejar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PickleJarOpenTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/picklejaropen.png");
	}
}
