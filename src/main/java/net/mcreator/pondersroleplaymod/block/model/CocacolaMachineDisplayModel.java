package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.CocacolaMachineDisplayItem;

public class CocacolaMachineDisplayModel extends AnimatedGeoModel<CocacolaMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CocacolaMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/sodamachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CocacolaMachineDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/sodamachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CocacolaMachineDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/cocacolamachine.png");
	}
}
