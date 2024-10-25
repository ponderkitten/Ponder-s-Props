package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornMachineOilDisplayItem;

public class PopcornMachineOilDisplayModel extends AnimatedGeoModel<PopcornMachineOilDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornMachineOilDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornmachineoil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornMachineOilDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornmachineoil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornMachineOilDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornmachineoil.png");
	}
}
