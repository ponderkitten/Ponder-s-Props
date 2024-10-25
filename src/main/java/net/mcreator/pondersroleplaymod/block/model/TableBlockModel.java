package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.TableTileEntity;

public class TableBlockModel extends AnimatedGeoModel<TableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TableTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/tablesolo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TableTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/tablesolo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TableTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/tableandfourchairs.png");
	}
}
