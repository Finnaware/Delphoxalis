package net.finnaware.delphoxalis.util;

import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class FoxTags {

    public static class Blocks {

        public static final TagKey<Block> VERTICAL_SLABS = createTag("vertical_slabs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Delphoxalis.MOD_ID, name));
        }

        ;
    }

}
