package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TrashBagBoxClosedDisplayItem;

public class TrashBagBoxClosedDisplayModel extends AnimatedGeoModel<TrashBagBoxClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagBoxClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trashbagbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagBoxClosedDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trashbagbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagBoxClosedDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/closedtrashbagbox.png");
	}
}
