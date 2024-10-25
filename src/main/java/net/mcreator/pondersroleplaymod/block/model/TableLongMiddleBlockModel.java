package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TableLongMiddleTileEntity;

public class TableLongMiddleBlockModel extends AnimatedGeoModel<TableLongMiddleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TableLongMiddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tablesolo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableLongMiddleTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tablesolo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableLongMiddleTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tablemiddle.png");
	}
}
