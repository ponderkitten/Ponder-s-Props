package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.WrenchBlockTileEntity;

public class WrenchBlockBlockModel extends AnimatedGeoModel<WrenchBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WrenchBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/smallwrenchblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchBlockTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/smallwrenchblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchBlockTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/smallwrenchblock.png");
	}
}
