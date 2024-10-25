package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FoldUpTableCenteredDisplayItem;

public class FoldUpTableCenteredDisplayModel extends AnimatedGeoModel<FoldUpTableCenteredDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoldUpTableCenteredDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/folduptablecentered.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoldUpTableCenteredDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/folduptablecentered.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoldUpTableCenteredDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/folduptableredmatt.png");
	}
}
