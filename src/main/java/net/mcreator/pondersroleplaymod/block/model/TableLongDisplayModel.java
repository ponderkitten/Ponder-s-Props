package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TableLongDisplayItem;

public class TableLongDisplayModel extends AnimatedGeoModel<TableLongDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TableLongDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tablesolo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableLongDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tablesolo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableLongDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
