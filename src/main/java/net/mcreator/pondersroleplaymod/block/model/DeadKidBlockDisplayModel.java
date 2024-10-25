package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.DeadKidBlockDisplayItem;

public class DeadKidBlockDisplayModel extends AnimatedGeoModel<DeadKidBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeadKidBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/deadkidblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeadKidBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/deadkidblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeadKidBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/deadkidblock.png");
	}
}
