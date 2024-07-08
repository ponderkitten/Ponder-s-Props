package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PaperOpenSignDisplayItem;

public class PaperOpenSignDisplayModel extends AnimatedGeoModel<PaperOpenSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PaperOpenSignDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/paperopenclosedsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperOpenSignDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/paperopenclosedsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperOpenSignDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/paperopensign.png");
	}
}
