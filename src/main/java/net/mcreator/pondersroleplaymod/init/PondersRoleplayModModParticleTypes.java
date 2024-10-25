
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pondersroleplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

public class PondersRoleplayModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PondersRoleplayModMod.MODID);
	public static final RegistryObject<SimpleParticleType> POPCORN_PARTICLE = REGISTRY.register("popcorn_particle", () -> new SimpleParticleType(false));
}
