package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.DeadKidBlockTileEntity;

public class DeadKidBlockBlockModel extends AnimatedGeoModel<DeadKidBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeadKidBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/deadkidblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeadKidBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/deadkidblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeadKidBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/deadkidblock.png");
	}
}
