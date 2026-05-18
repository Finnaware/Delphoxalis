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
        public static final TagKey<Item> DEV_MEASURE_GRAY = createTag("dev_measure_gray");
        public static final TagKey<Item> DEV_MEASURE_ORANGE = createTag("dev_measure_orange");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Delphoxalis.MOD_ID, name));
        }
    }

    public static void registerFoxTags() {
        Delphoxalis.LOGGER.info("Registering Tags for " + Delphoxalis.MOD_ID);
    }
}