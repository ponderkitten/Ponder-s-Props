package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PickleJarOpenDisplayItem;

public class PickleJarOpenDisplayModel extends AnimatedGeoModel<PickleJarOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PickleJarOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/picklejar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PickleJarOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/picklejar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PickleJarOpenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/picklejaropen.png");
	}
}
