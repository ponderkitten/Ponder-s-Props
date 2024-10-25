package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballmachineRedTileEntity;

public class GumballmachineRedBlockModel extends AnimatedGeoModel<GumballmachineRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballmachineRedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballmachineRedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballmachineRedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballred.png");
	}
}
