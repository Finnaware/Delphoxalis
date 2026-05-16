package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.finnaware.delphoxalis.Delphoxalis;

public class FoxStrippedWood {

    public static void registerFoxStrippedWood() {

        StrippableBlockRegistry.register(
                FoxBlocks.TWILIGHT_LOG,
                FoxBlocks.STRIPPED_TWILIGHT_LOG
        );
        StrippableBlockRegistry.register(
                FoxBlocks.TWILIGHT_WOOD,
                FoxBlocks.STRIPPED_TWILIGHT_WOOD
        );

        Delphoxalis.LOGGER.info("Registering Wood Stripping for " + Delphoxalis.MOD_ID);
    }
}