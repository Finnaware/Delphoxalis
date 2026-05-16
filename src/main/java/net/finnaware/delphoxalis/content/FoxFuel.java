package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.compat.vanillabackport.VBCompatBlocks;
import net.minecraft.item.ItemConvertible;

public class FoxFuel {
    private static final String VANILLA_BACKPORT = "vanillabackport";

    private static final int WOOD_BURN_TIME = 300;
    private static final int WOOD_DOOR_BURN_TIME = 200;
    private static final int WOOD_BUTTON_BURN_TIME = 100;
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
            FoxBlocks.TWILIGHT_LOG,
            FoxBlocks.STRIPPED_TWILIGHT_LOG,
            FoxBlocks.TWILIGHT_WOOD,
            FoxBlocks.STRIPPED_TWILIGHT_WOOD,
            FoxBlocks.TWILIGHT_PLANKS,
            FoxBlocks.TWILIGHT_STAIRS,
            FoxBlocks.TWILIGHT_PRESSURE_PLATE,
            FoxBlocks.TWILIGHT_TRAPDOOR,
            FoxBlocks.TWILIGHT_FENCE_GATE,
            FoxBlocks.TWILIGHT_FENCE,
            FoxBlocks.TWILIGHT_MOSAIC,
            FoxBlocks.ACACIA_MOSAIC_STAIRS,
            FoxBlocks.BIRCH_MOSAIC_STAIRS,
            FoxBlocks.CHERRY_MOSAIC_STAIRS,
            FoxBlocks.DARK_OAK_MOSAIC_STAIRS,
            FoxBlocks.JUNGLE_MOSAIC_STAIRS,
            FoxBlocks.MANGROVE_MOSAIC_STAIRS,
            FoxBlocks.OAK_MOSAIC_STAIRS,
            FoxBlocks.SPRUCE_MOSAIC_STAIRS,
            FoxBlocks.TWILIGHT_MOSAIC_STAIRS,
            FoxItems.WARBOW,
            FoxBlocks.CUT_ACACIA_PLANKS,
            FoxBlocks.CUT_BIRCH_PLANKS,
            FoxBlocks.CUT_CHERRY_PLANKS,
            FoxBlocks.CUT_DARK_OAK_PLANKS,
            FoxBlocks.CUT_JUNGLE_PLANKS,
            FoxBlocks.CUT_MANGROVE_PLANKS,
            FoxBlocks.CUT_OAK_PLANKS,
            FoxBlocks.CUT_SPRUCE_PLANKS,
            FoxBlocks.CUT_TWILIGHT_PLANKS
    };

    private static final ItemConvertible[] WOOD_DOORS = {
            FoxBlocks.TWILIGHT_DOOR,
    };

    private static final ItemConvertible[] WOOD_BUTTONS = {
            FoxBlocks.TWILIGHT_BUTTON,
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
            FoxBlocks.TWILIGHT_SLAB,
            FoxBlocks.TWILIGHT_MOSAIC_SLAB,
    };

    public static void registerFoxFuel() {
        registerFuel(WOOD_BURN_TIME, WOOD_BLOCKS);
        registerVanillaBackportFuel();
        registerFuel(WOOD_DOOR_BURN_TIME, WOOD_DOORS);
        registerFuel(WOOD_BUTTON_BURN_TIME, WOOD_BUTTONS);
        registerFuel(WOOD_SLAB_BURN_TIME, WOOD_SLABS);

        Delphoxalis.LOGGER.info("Registering Fuels for " + Delphoxalis.MOD_ID);
    }

    private static void registerVanillaBackportFuel() {
        if (!FabricLoader.getInstance().isModLoaded(VANILLA_BACKPORT)) {
            return;
        }

        registerFuel(WOOD_BURN_TIME,
                VBCompatBlocks.PALE_OAK_MOSAIC,
                VBCompatBlocks.PALE_OAK_MOSAIC_STAIRS,
                VBCompatBlocks.CUT_PALE_OAK_PLANKS
        );
        registerFuel(WOOD_SLAB_BURN_TIME,
                VBCompatBlocks.PALE_OAK_MOSAIC_SLAB
        );
    }

    private static void registerFuel(int burnTime, ItemConvertible... items) {
        for (ItemConvertible item : items) {
            FuelRegistry.INSTANCE.add(item, burnTime);
        }
    }
}
