package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.IceCreamMachineTopTileEntity;

public class IceCreamMachineTopBlockModel extends AnimatedGeoModel<IceCreamMachineTopTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IceCreamMachineTopTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/icecreammachinetop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceCreamMachineTopTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/icecreammachinetop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceCreamMachineTopTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/icecreammachinetop.png");
	}
}
