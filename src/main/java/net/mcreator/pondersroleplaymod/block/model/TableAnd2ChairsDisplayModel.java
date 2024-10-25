package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TableAnd2ChairsDisplayItem;

public class TableAnd2ChairsDisplayModel extends AnimatedGeoModel<TableAnd2ChairsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TableAnd2ChairsDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableAnd2ChairsDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableAnd2ChairsDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
