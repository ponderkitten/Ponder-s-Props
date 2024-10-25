package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.EnclosedTrashBinDisplayItem;

public class EnclosedTrashBinDisplayModel extends AnimatedGeoModel<EnclosedTrashBinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbin.png");
	}
}
