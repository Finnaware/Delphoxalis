package net.finnaware.delphoxalis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.finnaware.delphoxalis.item.FoxItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.ACACIA_MOSAIC)
                .stairs(FoxBlocks.ACACIA_MOSAIC_STAIRS)
                .slab(FoxBlocks.ACACIA_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.BIRCH_MOSAIC)
                .stairs(FoxBlocks.BIRCH_MOSAIC_STAIRS)
                .slab(FoxBlocks.BIRCH_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.CHERRY_MOSAIC)
                .stairs(FoxBlocks.CHERRY_MOSAIC_STAIRS)
                .slab(FoxBlocks.CHERRY_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.CRIMSON_MOSAIC)
                .stairs(FoxBlocks.CRIMSON_MOSAIC_STAIRS)
                .slab(FoxBlocks.CRIMSON_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.DARK_OAK_MOSAIC)
                .stairs(FoxBlocks.DARK_OAK_MOSAIC_STAIRS)
                .slab(FoxBlocks.DARK_OAK_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.JUNGLE_MOSAIC)
                .stairs(FoxBlocks.JUNGLE_MOSAIC_STAIRS)
                .slab(FoxBlocks.JUNGLE_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.MANGROVE_MOSAIC)
                .stairs(FoxBlocks.MANGROVE_MOSAIC_STAIRS)
                .slab(FoxBlocks.MANGROVE_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.OAK_MOSAIC)
                .stairs(FoxBlocks.OAK_MOSAIC_STAIRS)
                .slab(FoxBlocks.OAK_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.SPRUCE_MOSAIC)
                .stairs(FoxBlocks.SPRUCE_MOSAIC_STAIRS)
                .slab(FoxBlocks.SPRUCE_MOSAIC_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(FoxBlocks.WARPED_MOSAIC)
                .stairs(FoxBlocks.WARPED_MOSAIC_STAIRS)
                .slab(FoxBlocks.WARPED_MOSAIC_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(FoxItems.NETHERITE_MACE, Models.HANDHELD_MACE);
    }
}