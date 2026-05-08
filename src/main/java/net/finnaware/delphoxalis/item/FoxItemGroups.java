package net.finnaware.delphoxalis.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FoxItemGroups {

    public static final ItemGroup DELPHOXALIS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Delphoxalis.MOD_ID, "delphoxalis_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(FoxItems.NETHERITE_MACE))
                    .displayName(Text.translatable("itemgroup.delphoxalis.delphoxalis_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(FoxItems.NETHERITE_MACE);
                        entries.add(FoxBlocks.OAK_MOSAIC);
                        entries.add(FoxBlocks.OAK_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.OAK_MOSAIC_SLAB);
                        entries.add(FoxBlocks.SPRUCE_MOSAIC);
                        entries.add(FoxBlocks.SPRUCE_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.SPRUCE_MOSAIC_SLAB);
                        entries.add(FoxBlocks.BIRCH_MOSAIC);
                        entries.add(FoxBlocks.BIRCH_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.BIRCH_MOSAIC_SLAB);
                        entries.add(FoxBlocks.JUNGLE_MOSAIC);
                        entries.add(FoxBlocks.JUNGLE_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.JUNGLE_MOSAIC_SLAB);
                        entries.add(FoxBlocks.ACACIA_MOSAIC);
                        entries.add(FoxBlocks.ACACIA_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.ACACIA_MOSAIC_SLAB);
                        entries.add(FoxBlocks.DARK_OAK_MOSAIC);
                        entries.add(FoxBlocks.DARK_OAK_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.DARK_OAK_MOSAIC_SLAB);
                        entries.add(FoxBlocks.MANGROVE_MOSAIC);
                        entries.add(FoxBlocks.MANGROVE_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.MANGROVE_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CHERRY_MOSAIC);
                        entries.add(FoxBlocks.CHERRY_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.CHERRY_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CRIMSON_MOSAIC);
                        entries.add(FoxBlocks.CRIMSON_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.CRIMSON_MOSAIC_SLAB);
                        entries.add(FoxBlocks.WARPED_MOSAIC);
                        entries.add(FoxBlocks.WARPED_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.WARPED_MOSAIC_SLAB);
                    }).build()
    );

    public static void registerFoxGroups() {
        Delphoxalis.LOGGER.info("Registering Mod Item Groups for " + Delphoxalis.MOD_ID);
    }
}
