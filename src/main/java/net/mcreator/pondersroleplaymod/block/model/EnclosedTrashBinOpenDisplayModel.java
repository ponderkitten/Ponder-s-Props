package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.EnclosedTrashBinOpenDisplayItem;

public class EnclosedTrashBinOpenDisplayModel extends AnimatedGeoModel<EnclosedTrashBinOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbinopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbinopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinOpenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbinfull.png");
	}
}
