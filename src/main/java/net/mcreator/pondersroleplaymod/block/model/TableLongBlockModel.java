package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TableLongTileEntity;

public class TableLongBlockModel extends AnimatedGeoModel<TableLongTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TableLongTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tablesolo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableLongTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tablesolo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableLongTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
