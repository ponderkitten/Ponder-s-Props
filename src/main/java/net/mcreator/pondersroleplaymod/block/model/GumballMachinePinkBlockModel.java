package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.GumballMachinePinkTileEntity;

public class GumballMachinePinkBlockModel extends AnimatedGeoModel<GumballMachinePinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GumballMachinePinkTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballMachinePinkTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballMachinePinkTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballpink.png");
	}
}
