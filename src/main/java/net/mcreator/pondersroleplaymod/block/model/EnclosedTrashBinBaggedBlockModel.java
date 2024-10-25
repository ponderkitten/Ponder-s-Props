package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinBaggedTileEntity;

public class EnclosedTrashBinBaggedBlockModel extends AnimatedGeoModel<EnclosedTrashBinBaggedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinBaggedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbinopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinBaggedTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbinopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinBaggedTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbin.png");
	}
}
