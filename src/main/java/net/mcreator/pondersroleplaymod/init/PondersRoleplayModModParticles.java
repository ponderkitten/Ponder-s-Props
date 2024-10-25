
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pondersroleplaymod.client.particle.PopcornParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PondersRoleplayModModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(PondersRoleplayModModParticleTypes.POPCORN_PARTICLE.get(), PopcornParticleParticle::provider);
	}
}
