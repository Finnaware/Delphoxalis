package net.finnaware.delphoxalis.block;

import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class FoxBlocks {

    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.ORANGE)
                    .burnable()
            ));

    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.PALE_YELLOW)
                    .burnable()
            ));

    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .burnable()
            ));

    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.DULL_PINK)
            ));

    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.BROWN)
                    .burnable()
            ));

    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.DIRT_BROWN)
                    .burnable()
            ));

    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.RED)
                    .burnable()
            ));

    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.DARK_AQUA)
                    .burnable()
            ));

    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .burnable()
            ));

    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.DARK_AQUA)
            ));
    // stairs
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
            new StairsBlock(FoxBlocks.ACACIA_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(ACACIA_MOSAIC))));

    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
            new StairsBlock(FoxBlocks.BIRCH_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(BIRCH_MOSAIC))));

    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            new StairsBlock(FoxBlocks.CHERRY_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(CHERRY_MOSAIC))));

    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
            new StairsBlock(FoxBlocks.CRIMSON_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(CRIMSON_MOSAIC))));

    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
            new StairsBlock(FoxBlocks.DARK_OAK_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(DARK_OAK_MOSAIC))));

    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
            new StairsBlock(FoxBlocks.JUNGLE_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(JUNGLE_MOSAIC))));

    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
            new StairsBlock(FoxBlocks.MANGROVE_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(MANGROVE_MOSAIC))));

    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            new StairsBlock(FoxBlocks.OAK_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(OAK_MOSAIC))));

    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
            new StairsBlock(FoxBlocks.SPRUCE_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(SPRUCE_MOSAIC))));

    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
            new StairsBlock(FoxBlocks.WARPED_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(WARPED_MOSAIC))));
    // slabs
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ACACIA_MOSAIC)));

    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(BIRCH_MOSAIC)));

    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CHERRY_MOSAIC)));

    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(CRIMSON_MOSAIC)));

    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DARK_OAK_MOSAIC)));

    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(JUNGLE_MOSAIC)));

    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MANGROVE_MOSAIC)));

    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(OAK_MOSAIC)));

    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SPRUCE_MOSAIC)));

    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(WARPED_MOSAIC)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Delphoxalis.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Delphoxalis.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerFoxBlocks() {
        Delphoxalis.LOGGER.info("Registering Mod Blocks for " + Delphoxalis.MOD_ID);
    }
}
