package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.IceCreamMachineBottomTileEntity;

public class IceCreamMachineBottomBlockModel extends AnimatedGeoModel<IceCreamMachineBottomTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IceCreamMachineBottomTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/icecreammachinebottom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceCreamMachineBottomTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/icecreammachinebottom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceCreamMachineBottomTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/icecreammachinebottom.png");
	}
}
