package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolWallTapeTileEntity;

public class ToolWallTapeBlockModel extends AnimatedGeoModel<ToolWallTapeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallTapeTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallTapeTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallTapeTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwalltape.png");
	}
}
