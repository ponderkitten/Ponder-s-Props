package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ClawMachineFailDisplayItem;

public class ClawMachineFailDisplayModel extends AnimatedGeoModel<ClawMachineFailDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineFailDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/clawmachinefail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineFailDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/clawmachinefail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineFailDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/clawmachine.png");
	}
}
