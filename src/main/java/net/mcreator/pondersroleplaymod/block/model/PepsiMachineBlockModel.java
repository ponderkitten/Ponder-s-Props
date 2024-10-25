package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PepsiMachineTileEntity;

public class PepsiMachineBlockModel extends AnimatedGeoModel<PepsiMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PepsiMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodamachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PepsiMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodamachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PepsiMachineTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/pepsimachine.png");
	}
}
