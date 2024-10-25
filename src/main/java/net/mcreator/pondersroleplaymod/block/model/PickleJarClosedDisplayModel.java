package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PickleJarClosedDisplayItem;

public class PickleJarClosedDisplayModel extends AnimatedGeoModel<PickleJarClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PickleJarClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/picklejar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PickleJarClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/picklejar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PickleJarClosedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/picklejar.png");
	}
}
