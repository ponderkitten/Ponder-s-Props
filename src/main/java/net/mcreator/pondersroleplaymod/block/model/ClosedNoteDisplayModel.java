package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.ClosedNoteDisplayItem;

public class ClosedNoteDisplayModel extends AnimatedGeoModel<ClosedNoteDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClosedNoteDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/blankpapersign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClosedNoteDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/blankpapersign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClosedNoteDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/closedindefinitely.png");
	}
}
