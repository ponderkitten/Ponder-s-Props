package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TableAnd2ChairsTileEntity;

public class TableAnd2ChairsBlockModel extends AnimatedGeoModel<TableAnd2ChairsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TableAnd2ChairsTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableAnd2ChairsTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableAnd2ChairsTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandtwochairs.png");
	}
}
