package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.PaperClosedSignDisplayItem;

public class PaperClosedSignDisplayModel extends AnimatedGeoModel<PaperClosedSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PaperClosedSignDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/paperopenclosedsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperClosedSignDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/paperopenclosedsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperClosedSignDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/paperclosedsign.png");
	}
}
