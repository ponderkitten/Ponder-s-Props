package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.CocacolaMachineTileEntity;

public class CocacolaMachineBlockModel extends AnimatedGeoModel<CocacolaMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CocacolaMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodamachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CocacolaMachineTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodamachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CocacolaMachineTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cocacolamachine.png");
	}
}
