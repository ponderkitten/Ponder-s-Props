
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pondersroleplaymod.client.model.Modelunknown;
import net.mcreator.pondersroleplaymod.client.model.Modelsplat;
import net.mcreator.pondersroleplaymod.client.model.Modela;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PondersRoleplayModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modela.LAYER_LOCATION, Modela::createBodyLayer);
		event.registerLayerDefinition(Modelunknown.LAYER_LOCATION, Modelunknown::createBodyLayer);
		event.registerLayerDefinition(Modelsplat.LAYER_LOCATION, Modelsplat::createBodyLayer);
	}
}
