package net.finnaware.delphoxalis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(FoxBlocks.ACACIA_MOSAIC)
                .add(FoxBlocks.ACACIA_MOSAIC_STAIRS)
                .add(FoxBlocks.ACACIA_MOSAIC_SLAB)
                .add(FoxBlocks.BIRCH_MOSAIC)
                .add(FoxBlocks.BIRCH_MOSAIC_STAIRS)
                .add(FoxBlocks.BIRCH_MOSAIC_SLAB)
                .add(FoxBlocks.CHERRY_MOSAIC)
                .add(FoxBlocks.CHERRY_MOSAIC_STAIRS)
                .add(FoxBlocks.CHERRY_MOSAIC_SLAB)
                .add(FoxBlocks.CRIMSON_MOSAIC)
                .add(FoxBlocks.CRIMSON_MOSAIC_STAIRS)
                .add(FoxBlocks.CRIMSON_MOSAIC_SLAB)
                .add(FoxBlocks.DARK_OAK_MOSAIC)
                .add(FoxBlocks.DARK_OAK_MOSAIC_STAIRS)
                .add(FoxBlocks.DARK_OAK_MOSAIC_SLAB)
                .add(FoxBlocks.JUNGLE_MOSAIC)
                .add(FoxBlocks.JUNGLE_MOSAIC_STAIRS)
                .add(FoxBlocks.JUNGLE_MOSAIC_SLAB)
                .add(FoxBlocks.MANGROVE_MOSAIC)
                .add(FoxBlocks.MANGROVE_MOSAIC_STAIRS)
                .add(FoxBlocks.MANGROVE_MOSAIC_SLAB)
                .add(FoxBlocks.OAK_MOSAIC)
                .add(FoxBlocks.OAK_MOSAIC_STAIRS)
                .add(FoxBlocks.OAK_MOSAIC_SLAB)
                .add(FoxBlocks.SPRUCE_MOSAIC)
                .add(FoxBlocks.SPRUCE_MOSAIC_STAIRS)
                .add(FoxBlocks.SPRUCE_MOSAIC_SLAB)
                .add(FoxBlocks.WARPED_MOSAIC)
                .add(FoxBlocks.WARPED_MOSAIC_STAIRS)
                .add(FoxBlocks.WARPED_MOSAIC_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(FoxBlocks.ACACIA_MOSAIC_STAIRS)
                .add(FoxBlocks.BIRCH_MOSAIC_STAIRS)
                .add(FoxBlocks.CHERRY_MOSAIC_STAIRS)
                .add(FoxBlocks.CRIMSON_MOSAIC_STAIRS)
                .add(FoxBlocks.DARK_OAK_MOSAIC_STAIRS)
                .add(FoxBlocks.JUNGLE_MOSAIC_STAIRS)
                .add(FoxBlocks.MANGROVE_MOSAIC_STAIRS)
                .add(FoxBlocks.OAK_MOSAIC_STAIRS)
                .add(FoxBlocks.SPRUCE_MOSAIC_STAIRS)
                .add(FoxBlocks.WARPED_MOSAIC_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(FoxBlocks.ACACIA_MOSAIC_STAIRS)
                .add(FoxBlocks.BIRCH_MOSAIC_STAIRS)
                .add(FoxBlocks.CHERRY_MOSAIC_STAIRS)
                .add(FoxBlocks.CRIMSON_MOSAIC_STAIRS)
                .add(FoxBlocks.DARK_OAK_MOSAIC_STAIRS)
                .add(FoxBlocks.JUNGLE_MOSAIC_STAIRS)
                .add(FoxBlocks.MANGROVE_MOSAIC_STAIRS)
                .add(FoxBlocks.OAK_MOSAIC_STAIRS)
                .add(FoxBlocks.SPRUCE_MOSAIC_STAIRS)
                .add(FoxBlocks.WARPED_MOSAIC_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(FoxBlocks.ACACIA_MOSAIC_SLAB)
                .add(FoxBlocks.BIRCH_MOSAIC_SLAB)
                .add(FoxBlocks.CHERRY_MOSAIC_SLAB)
                .add(FoxBlocks.CRIMSON_MOSAIC_SLAB)
                .add(FoxBlocks.DARK_OAK_MOSAIC_SLAB)
                .add(FoxBlocks.JUNGLE_MOSAIC_SLAB)
                .add(FoxBlocks.MANGROVE_MOSAIC_SLAB)
                .add(FoxBlocks.OAK_MOSAIC_SLAB)
                .add(FoxBlocks.SPRUCE_MOSAIC_SLAB)
                .add(FoxBlocks.WARPED_MOSAIC_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(FoxBlocks.ACACIA_MOSAIC_SLAB)
                .add(FoxBlocks.BIRCH_MOSAIC_SLAB)
                .add(FoxBlocks.CHERRY_MOSAIC_SLAB)
                .add(FoxBlocks.CRIMSON_MOSAIC_SLAB)
                .add(FoxBlocks.DARK_OAK_MOSAIC_SLAB)
                .add(FoxBlocks.JUNGLE_MOSAIC_SLAB)
                .add(FoxBlocks.MANGROVE_MOSAIC_SLAB)
                .add(FoxBlocks.OAK_MOSAIC_SLAB)
                .add(FoxBlocks.SPRUCE_MOSAIC_SLAB)
                .add(FoxBlocks.WARPED_MOSAIC_SLAB);
    }
}
