package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ClawMachineSuccessDisplayItem;

public class ClawMachineSuccessDisplayModel extends AnimatedGeoModel<ClawMachineSuccessDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineSuccessDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/clawmachinesuccess.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineSuccessDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/clawmachinesuccess.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineSuccessDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/clawmachine.png");
	}
}
