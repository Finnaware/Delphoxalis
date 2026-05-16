package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.compat.vanillabackport.VBCompatBlocks;
import net.minecraft.block.Block;

public class FoxFlammableBlocks {
    private static final String VANILLA_BACKPORT = "vanillabackport";

    private static final int WOOD_BURN_CHANCE = 5;
    private static final int WOOD_SPREAD_CHANCE = 20;
    private static final int LOG_BURN_CHANCE = 5;
    private static final int LOG_SPREAD_CHANCE = 5;
    private static final int LEAVES_BURN_CHANCE = 30;
    private static final int LEAVES_SPREAD_CHANCE = 60;

    private static final Block[] WOOD_BLOCKS = {
            FoxBlocks.ACACIA_MOSAIC,
            FoxBlocks.BIRCH_MOSAIC,
            FoxBlocks.CHERRY_MOSAIC,
            FoxBlocks.DARK_OAK_MOSAIC,
            FoxBlocks.JUNGLE_MOSAIC,
            FoxBlocks.MANGROVE_MOSAIC,
            FoxBlocks.OAK_MOSAIC,
            FoxBlocks.SPRUCE_MOSAIC,
            FoxBlocks.TWILIGHT_PLANKS,
            FoxBlocks.TWILIGHT_STAIRS,
            FoxBlocks.TWILIGHT_SLAB,
            FoxBlocks.TWILIGHT_PRESSURE_PLATE,
            FoxBlocks.TWILIGHT_BUTTON,
            FoxBlocks.TWILIGHT_TRAPDOOR,
            FoxBlocks.TWILIGHT_DOOR,
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
            FoxBlocks.ACACIA_MOSAIC_SLAB,
            FoxBlocks.BIRCH_MOSAIC_SLAB,
            FoxBlocks.CHERRY_MOSAIC_SLAB,
            FoxBlocks.DARK_OAK_MOSAIC_SLAB,
            FoxBlocks.JUNGLE_MOSAIC_SLAB,
            FoxBlocks.MANGROVE_MOSAIC_SLAB,
            FoxBlocks.OAK_MOSAIC_SLAB,
            FoxBlocks.SPRUCE_MOSAIC_SLAB,
            FoxBlocks.TWILIGHT_MOSAIC_SLAB,
            FoxBlocks.CUT_ACACIA_PLANKS,
            FoxBlocks.CUT_BIRCH_PLANKS,
            FoxBlocks.CUT_CHERRY_PLANKS,
            FoxBlocks.CUT_DARK_OAK_PLANKS,
            FoxBlocks.CUT_JUNGLE_PLANKS,
            FoxBlocks.CUT_MANGROVE_PLANKS,
            FoxBlocks.CUT_OAK_PLANKS,
            FoxBlocks.CUT_SPRUCE_PLANKS,
            FoxBlocks.CUT_TWILIGHT_PLANKS,
    };

    private static final Block[] LOG_BLOCKS = {
            FoxBlocks.TWILIGHT_LOG,
            FoxBlocks.STRIPPED_TWILIGHT_LOG,
            FoxBlocks.TWILIGHT_WOOD,
            FoxBlocks.STRIPPED_TWILIGHT_WOOD,
            FoxBlocks.ROUTER_PLUSH,
    };

    private static final Block[] LEAVES_BLOCKS = {
            FoxBlocks.SCARLET_LEAVES,
    };

    public static void registerFoxFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registerBlocks(registry, WOOD_BURN_CHANCE, WOOD_SPREAD_CHANCE, WOOD_BLOCKS);
        registerVanillaBackportBlocks(registry);
        registerBlocks(registry, LOG_BURN_CHANCE, LOG_SPREAD_CHANCE, LOG_BLOCKS);
        registerBlocks(registry, LEAVES_BURN_CHANCE, LEAVES_SPREAD_CHANCE, LEAVES_BLOCKS);

        Delphoxalis.LOGGER.info("Registering Flammable Blocks for " + Delphoxalis.MOD_ID);
    }

    private static void registerVanillaBackportBlocks(FlammableBlockRegistry registry) {
        if (!FabricLoader.getInstance().isModLoaded(VANILLA_BACKPORT)) {
            return;
        }
        registerBlocks(registry, WOOD_BURN_CHANCE, WOOD_SPREAD_CHANCE,
                VBCompatBlocks.PALE_OAK_MOSAIC,
                VBCompatBlocks.PALE_OAK_MOSAIC_STAIRS,
                VBCompatBlocks.PALE_OAK_MOSAIC_SLAB,
                VBCompatBlocks.CUT_PALE_OAK_PLANKS
        );
    }

    private static void registerBlocks(FlammableBlockRegistry registry, int burnChance, int spreadChance, Block... blocks) {
        for (Block block : blocks) {
            registry.add(block, burnChance, spreadChance);
        }
    }
}
