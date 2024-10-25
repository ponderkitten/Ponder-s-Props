package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TableAnd4ChairsTileEntity;

public class TableAnd4ChairsBlockModel extends AnimatedGeoModel<TableAnd4ChairsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TableAnd4ChairsTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/table2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableAnd4ChairsTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/table2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableAnd4ChairsTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandfourchairs.png");
	}
}
