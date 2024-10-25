package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.IceCreamMachineBottomDisplayItem;

public class IceCreamMachineBottomDisplayModel extends AnimatedGeoModel<IceCreamMachineBottomDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IceCreamMachineBottomDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/icecreammachinebottom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceCreamMachineBottomDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/icecreammachinebottom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceCreamMachineBottomDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/icecreammachinebottom.png");
	}
}
