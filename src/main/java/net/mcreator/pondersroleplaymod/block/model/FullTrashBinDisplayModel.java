package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FullTrashBinDisplayItem;

public class FullTrashBinDisplayModel extends AnimatedGeoModel<FullTrashBinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FullTrashBinDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FullTrashBinDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FullTrashBinDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/full_trash_bin.png");
	}
}
