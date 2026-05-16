package net.finnaware.delphoxalis.world;

import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class FoxConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SCARLET_TREE_KEY = registerKey("scarlet_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Delphoxalis.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
