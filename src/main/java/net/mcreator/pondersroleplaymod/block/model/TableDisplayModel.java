package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.display.TableDisplayItem;

public class TableDisplayModel extends AnimatedGeoModel<TableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TableDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tablesolo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableDisplayItem animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tablesolo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableDisplayItem entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandfourchairs.png");
	}
}
