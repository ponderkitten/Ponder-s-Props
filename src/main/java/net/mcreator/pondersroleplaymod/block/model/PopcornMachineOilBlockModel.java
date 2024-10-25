package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PopcornMachineOilTileEntity;

public class PopcornMachineOilBlockModel extends AnimatedGeoModel<PopcornMachineOilTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMachineOilTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmachineoil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMachineOilTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmachineoil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMachineOilTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmachineoil.png");
	}
}
