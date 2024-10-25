package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.ToolWallMonkeyWrenchTileEntity;

public class ToolWallMonkeyWrenchBlockModel extends AnimatedGeoModel<ToolWallMonkeyWrenchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolWallMonkeyWrenchTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/toolwall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolWallMonkeyWrenchTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/toolwall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolWallMonkeyWrenchTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/toolwallmonkeywrench.png");
	}
}
