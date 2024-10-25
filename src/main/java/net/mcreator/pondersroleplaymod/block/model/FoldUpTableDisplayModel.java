package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.FoldUpTableDisplayItem;

public class FoldUpTableDisplayModel extends AnimatedGeoModel<FoldUpTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoldUpTableDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/folduptable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoldUpTableDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/folduptable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoldUpTableDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/folduptableredmatt.png");
	}
}
