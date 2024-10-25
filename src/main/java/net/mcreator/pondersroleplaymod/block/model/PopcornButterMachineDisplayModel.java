package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PopcornButterMachineDisplayItem;

public class PopcornButterMachineDisplayModel extends AnimatedGeoModel<PopcornButterMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopcornButterMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/popcornbutter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopcornButterMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/popcornbutter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopcornButterMachineDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/popcornbuttermachine.png");
	}
}
