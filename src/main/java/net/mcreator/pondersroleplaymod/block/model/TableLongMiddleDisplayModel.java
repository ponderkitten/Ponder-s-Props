package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TableLongMiddleDisplayItem;

public class TableLongMiddleDisplayModel extends AnimatedGeoModel<TableLongMiddleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TableLongMiddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tablesolo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableLongMiddleDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tablesolo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableLongMiddleDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tablemiddle.png");
	}
}
