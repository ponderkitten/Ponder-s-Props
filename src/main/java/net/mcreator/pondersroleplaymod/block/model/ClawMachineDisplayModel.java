package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ClawMachineDisplayItem;

public class ClawMachineDisplayModel extends AnimatedGeoModel<ClawMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/clawmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/clawmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/clawmachine.png");
	}
}
