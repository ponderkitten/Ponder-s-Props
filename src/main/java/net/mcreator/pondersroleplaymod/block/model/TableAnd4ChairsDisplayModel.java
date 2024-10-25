package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TableAnd4ChairsDisplayItem;

public class TableAnd4ChairsDisplayModel extends AnimatedGeoModel<TableAnd4ChairsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TableAnd4ChairsDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/table2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableAnd4ChairsDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/table2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableAnd4ChairsDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandfourchairs.png");
	}
}
