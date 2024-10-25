package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.GumballMachinePinkDisplayItem;

public class GumballMachinePinkDisplayModel extends AnimatedGeoModel<GumballMachinePinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GumballMachinePinkDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/gumballmachine1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GumballMachinePinkDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/gumballmachine1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GumballMachinePinkDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/gumballpink.png");
	}
}
