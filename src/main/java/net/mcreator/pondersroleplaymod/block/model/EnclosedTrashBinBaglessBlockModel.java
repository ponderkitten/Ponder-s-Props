package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.EnclosedTrashBinBaglessTileEntity;

public class EnclosedTrashBinBaglessBlockModel extends AnimatedGeoModel<EnclosedTrashBinBaglessTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnclosedTrashBinBaglessTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/enclosedtrashbinopen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnclosedTrashBinBaglessTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/enclosedtrashbinopen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnclosedTrashBinBaglessTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/enclosedtrashbinbagless.png");
	}
}
