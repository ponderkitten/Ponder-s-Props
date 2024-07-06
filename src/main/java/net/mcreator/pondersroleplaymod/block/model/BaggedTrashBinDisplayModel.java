package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.BaggedTrashBinDisplayItem;

public class BaggedTrashBinDisplayModel extends AnimatedGeoModel<BaggedTrashBinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BaggedTrashBinDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trash_bin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggedTrashBinDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trash_bin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggedTrashBinDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/empty_trash_bin.png");
	}
}
