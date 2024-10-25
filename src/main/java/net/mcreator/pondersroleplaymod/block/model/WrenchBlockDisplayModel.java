package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.WrenchBlockDisplayItem;

public class WrenchBlockDisplayModel extends AnimatedGeoModel<WrenchBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WrenchBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/smallwrenchblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchBlockDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/smallwrenchblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchBlockDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/smallwrenchblock.png");
	}
}
