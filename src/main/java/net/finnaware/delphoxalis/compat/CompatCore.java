package net.finnaware.delphoxalis.compat;

import net.fabricmc.loader.api.FabricLoader;
import net.finnaware.delphoxalis.compat.vanillabackport.VBCompat;

public class CompatCore {
    public static void register() {
        if (FabricLoader.getInstance().isModLoaded("vanillabackport")) {
            VBCompat.register();
        }
    }
}