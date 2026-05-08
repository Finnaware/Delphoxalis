package net.finnaware.delphoxalis.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.minecraft.item.ItemConvertible;

public class FoxFuel {
    private static final int WOOD_BURN_TIME = 300;
    private static final int WOOD_SLAB_BURN_TIME = 150;

    private static final ItemConvertible[] WOOD_BLOCKS = {
            FoxBlocks.ACACIA_MOSAIC,
            FoxBlocks.BIRCH_MOSAIC,
            FoxBlocks.CHERRY_MOSAIC,
            FoxBlocks.DARK_OAK_MOSAIC,
            FoxBlocks.JUNGLE_MOSAIC,
            FoxBlocks.MANGROVE_MOSAIC,
            FoxBlocks.OAK_MOSAIC,
            FoxBlocks.SPRUCE_MOSAIC,
            FoxBlocks.ACACIA_MOSAIC_STAIRS,
            FoxBlocks.BIRCH_MOSAIC_STAIRS,
            FoxBlocks.CHERRY_MOSAIC_STAIRS,
            FoxBlocks.DARK_OAK_MOSAIC_STAIRS,
            FoxBlocks.JUNGLE_MOSAIC_STAIRS,
            FoxBlocks.MANGROVE_MOSAIC_STAIRS,
            FoxBlocks.OAK_MOSAIC_STAIRS,
            FoxBlocks.SPRUCE_MOSAIC_STAIRS,
    };

    private static final ItemConvertible[] WOOD_SLABS = {
            FoxBlocks.ACACIA_MOSAIC_SLAB,
            FoxBlocks.BIRCH_MOSAIC_SLAB,
            FoxBlocks.CHERRY_MOSAIC_SLAB,
            FoxBlocks.DARK_OAK_MOSAIC_SLAB,
            FoxBlocks.JUNGLE_MOSAIC_SLAB,
            FoxBlocks.MANGROVE_MOSAIC_SLAB,
            FoxBlocks.OAK_MOSAIC_SLAB,
            FoxBlocks.SPRUCE_MOSAIC_SLAB,
    };

    public static void registerFoxFuel() {
        for (ItemConvertible wood : WOOD_BLOCKS) {
            FuelRegistry.INSTANCE.add(wood, WOOD_BURN_TIME);
        }
        for (ItemConvertible slab : WOOD_SLABS) {
            FuelRegistry.INSTANCE.add(slab, WOOD_SLAB_BURN_TIME);
        }
        Delphoxalis.LOGGER.info("Registering Fuels for " + Delphoxalis.MOD_ID);
    }
}
