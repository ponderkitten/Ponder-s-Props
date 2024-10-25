package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.EnclosedTrashBinBaggedDisplayItem;

public class EnclosedTrashBinBaggedDisplayModel extends AnimatedGeoModel<EnclosedTrashBinBaggedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinBaggedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbinopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinBaggedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbinopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinBaggedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbin.png");
	}
}
