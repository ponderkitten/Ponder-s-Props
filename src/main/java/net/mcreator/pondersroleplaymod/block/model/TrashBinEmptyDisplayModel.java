package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TrashBinEmptyDisplayItem;

public class TrashBinEmptyDisplayModel extends AnimatedGeoModel<TrashBinEmptyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinEmptyDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinEmptyDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinEmptyDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/bagged_trash_bin.png");
	}
}
