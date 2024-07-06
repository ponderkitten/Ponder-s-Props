package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TrashBinStage3DisplayItem;

public class TrashBinStage3DisplayModel extends AnimatedGeoModel<TrashBinStage3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinStage3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bintrash3-4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinStage3DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bintrash3-4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinStage3DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
