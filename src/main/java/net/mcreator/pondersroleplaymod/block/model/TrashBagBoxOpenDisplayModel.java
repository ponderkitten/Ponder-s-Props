package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TrashBagBoxOpenDisplayItem;

public class TrashBagBoxOpenDisplayModel extends AnimatedGeoModel<TrashBagBoxOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagBoxOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/trashbagbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagBoxOpenDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/trashbagbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagBoxOpenDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/opntrashbagbox.png");
	}
}
