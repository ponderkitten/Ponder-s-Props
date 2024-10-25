package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.IceCreamMachineTopDisplayItem;

public class IceCreamMachineTopDisplayModel extends AnimatedGeoModel<IceCreamMachineTopDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IceCreamMachineTopDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/icecreammachinetop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceCreamMachineTopDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/icecreammachinetop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceCreamMachineTopDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/icecreammachinetop.png");
	}
}
