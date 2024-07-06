package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TrashbinStage2DisplayItem;

public class TrashbinStage2DisplayModel extends AnimatedGeoModel<TrashbinStage2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashbinStage2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bintrash2-4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashbinStage2DisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bintrash2-4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashbinStage2DisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
