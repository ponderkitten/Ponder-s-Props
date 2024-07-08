package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PaperOpenSignTileEntity;

public class PaperOpenSignBlockModel extends AnimatedGeoModel<PaperOpenSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaperOpenSignTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/paperopenclosedsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperOpenSignTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/paperopenclosedsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperOpenSignTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/paperopensign.png");
	}
}
