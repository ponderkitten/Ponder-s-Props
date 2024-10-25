package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.FrenchPress3TileEntity;

public class FrenchPress3BlockModel extends AnimatedGeoModel<FrenchPress3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrenchPress3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/frenchpress.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrenchPress3TileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/frenchpress.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrenchPress3TileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/frenshpresssteeping.png");
	}
}
