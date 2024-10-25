package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ChangeMachineDisplayItem;

public class ChangeMachineDisplayModel extends AnimatedGeoModel<ChangeMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChangeMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/changemachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChangeMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/changemachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChangeMachineDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/changemachinetop.png");
	}
}
