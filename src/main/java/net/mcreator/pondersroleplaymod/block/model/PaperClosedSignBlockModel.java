package net.mcreator.pondersroleplaymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pondersroleplaymod.block.entity.PaperClosedSignTileEntity;

public class PaperClosedSignBlockModel extends AnimatedGeoModel<PaperClosedSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaperClosedSignTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "animations/paperopenclosedsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperClosedSignTileEntity animatable) {
		return new ResourceLocation("ponders_roleplay_mod", "geo/paperopenclosedsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperClosedSignTileEntity entity) {
		return new ResourceLocation("ponders_roleplay_mod", "textures/blocks/paperclosedsign.png");
	}
}
