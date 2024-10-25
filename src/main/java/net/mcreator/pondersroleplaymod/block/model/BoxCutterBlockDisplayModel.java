package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.BoxCutterBlockDisplayItem;

public class BoxCutterBlockDisplayModel extends AnimatedGeoModel<BoxCutterBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxCutterBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/boxcutterblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxCutterBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/boxcutterblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxCutterBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/boxcutterblock.png");
	}
}
