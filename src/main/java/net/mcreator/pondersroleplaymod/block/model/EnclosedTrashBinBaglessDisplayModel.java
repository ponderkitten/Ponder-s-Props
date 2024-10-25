package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.EnclosedTrashBinBaglessDisplayItem;

public class EnclosedTrashBinBaglessDisplayModel extends AnimatedGeoModel<EnclosedTrashBinBaglessDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinBaglessDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbinopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinBaglessDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbinopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinBaglessDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbinbagless.png");
	}
}
