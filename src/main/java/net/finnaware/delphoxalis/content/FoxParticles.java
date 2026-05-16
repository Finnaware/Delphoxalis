package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FoxParticles {
    public static final SimpleParticleType SCARLET_LEAVES = Registry.register(
            Registries.PARTICLE_TYPE,
            Identifier.of(Delphoxalis.MOD_ID, "scarlet_leaves"),
            FabricParticleTypes.simple()
    );

    public static void registerFoxParticles() {
        Delphoxalis.LOGGER.info("Registering Particles for " + Delphoxalis.MOD_ID);
    }
}
