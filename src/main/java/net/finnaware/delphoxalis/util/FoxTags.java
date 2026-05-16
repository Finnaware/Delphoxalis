package net.finnaware.delphoxalis.util;

import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class FoxTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Delphoxalis.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TWILIGHT_LOGS = createTag("twilight_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Delphoxalis.MOD_ID, name));
        }
    }

    public static void registerFoxTags() {
        Delphoxalis.LOGGER.info("Registering Tags for " + Delphoxalis.MOD_ID);
    }
}