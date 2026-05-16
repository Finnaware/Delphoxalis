package net.finnaware.delphoxalis.content;

import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.content.block.PlushBlock;
import net.finnaware.delphoxalis.content.block.ScarletLeavesBlock;
import net.finnaware.delphoxalis.content.block.CubeMapBlock;
import net.finnaware.delphoxalis.world.tree.FoxSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
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
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.RED)
                    .burnable()
            ));

    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.OAK_TAN)
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

    // CUT PLANKS
    public static final Block CUT_ACACIA_PLANKS = registerBlock("cut_acacia_planks",
            new Block(AbstractBlock.Settings.copy(ACACIA_MOSAIC)));

    public static final Block CUT_BIRCH_PLANKS = registerBlock("cut_birch_planks",
            new Block(AbstractBlock.Settings.copy(BIRCH_MOSAIC)));

    public static final Block CUT_CHERRY_PLANKS = registerBlock("cut_cherry_planks",
            new Block(AbstractBlock.Settings.copy(CHERRY_MOSAIC)));

    public static final Block CUT_CRIMSON_PLANKS = registerBlock("cut_crimson_planks",
            new Block(AbstractBlock.Settings.copy(CRIMSON_MOSAIC)));

    public static final Block CUT_DARK_OAK_PLANKS = registerBlock("cut_dark_oak_planks",
            new Block(AbstractBlock.Settings.copy(DARK_OAK_MOSAIC)));

    public static final Block CUT_JUNGLE_PLANKS = registerBlock("cut_jungle_planks",
            new Block(AbstractBlock.Settings.copy(JUNGLE_MOSAIC)));

    public static final Block CUT_MANGROVE_PLANKS = registerBlock("cut_mangrove_planks",
            new Block(AbstractBlock.Settings.copy(MANGROVE_MOSAIC)));

    public static final Block CUT_OAK_PLANKS = registerBlock("cut_oak_planks",
            new Block(AbstractBlock.Settings.copy(OAK_MOSAIC)));

    public static final Block CUT_SPRUCE_PLANKS = registerBlock("cut_spruce_planks",
            new Block(AbstractBlock.Settings.copy(SPRUCE_MOSAIC)));

    public static final Block CUT_WARPED_PLANKS = registerBlock("cut_warped_planks",
            new Block(AbstractBlock.Settings.copy(WARPED_MOSAIC)));

    public static final Block CUT_BAMBOO_PLANKS = registerBlock("cut_bamboo_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.YELLOW)
                    .burnable()
            ));

    public static final Block DEV_MEASURE_1_GRAY = registerBlock("dev_measure_1_gray",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5F, 6F)
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .requiresTool()
            ));

    public static final Block DEV_MEASURE_GRAY_DOOR = registerBlock("dev_measure_gray_door",
            new DoorBlock(BlockSetType.OAK, (AbstractBlock.Settings.copy(DEV_MEASURE_1_GRAY))));

    public static final Block DEV_MEASURE_2_GRAY = registerBlock("dev_measure_2_gray",
            new Block(AbstractBlock.Settings.copy(DEV_MEASURE_1_GRAY)));

    public static final Block DEV_MEASURE_3_GRAY = registerBlock("dev_measure_3_gray",
            new Block(AbstractBlock.Settings.copy(DEV_MEASURE_1_GRAY)));

    public static final Block DEV_MEASURE_1_ORANGE = registerBlock("dev_measure_1_orange",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5F, 6F)
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
            ));

    public static final Block DEV_MEASURE_ORANGE_DOOR = registerBlock("dev_measure_orange_door",
            new DoorBlock(BlockSetType.OAK, (AbstractBlock.Settings.copy(DEV_MEASURE_1_ORANGE))));

    public static final Block DEV_MEASURE_2_ORANGE = registerBlock("dev_measure_2_orange",
            new Block(AbstractBlock.Settings.copy(DEV_MEASURE_1_ORANGE)));

    public static final Block DEV_MEASURE_3_ORANGE = registerBlock("dev_measure_3_orange",
            new Block(AbstractBlock.Settings.copy(DEV_MEASURE_1_ORANGE)));

    public static final Block TILE_FLOOR = registerBlock("tile_floor",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5F, 6F)
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.GRAY)
                    .requiresTool()
            ));

    public static final Block TILE_FLOOR_STAIRS = registerBlock("tile_floor_stairs",
            new StairsBlock(FoxBlocks.TILE_FLOOR.getDefaultState(),
                    (AbstractBlock.Settings.copy(TILE_FLOOR))));

    public static final Block TILE_FLOOR_SLAB = registerBlock("tile_floor_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TILE_FLOOR)));

    public static final Block MISSING_TEXTURE = registerBlock("missing_texture",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5F, 6F)
                    .sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
            ));

    public static final Block MISSING_TEXTURE_STAIRS = registerBlock("missing_texture_stairs",
            new StairsBlock(FoxBlocks.MISSING_TEXTURE.getDefaultState(),
                    (AbstractBlock.Settings.copy(MISSING_TEXTURE))));

    public static final Block MISSING_TEXTURE_SLAB = registerBlock("missing_texture_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MISSING_TEXTURE)));

    public static final Block TWILIGHT_LOG = registerBlock("twilight_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.BLUE)
                    .burnable()
            ));

    public static final Block STRIPPED_TWILIGHT_LOG = registerBlock("stripped_twilight_log",
            new PillarBlock(AbstractBlock.Settings.copy(TWILIGHT_LOG)));

    public static final Block TWILIGHT_WOOD = registerBlock("twilight_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.BLUE)
                    .burnable()
            ));

    public static final Block STRIPPED_TWILIGHT_WOOD = registerBlock("stripped_twilight_wood",
            new PillarBlock(AbstractBlock.Settings.copy(TWILIGHT_WOOD)));

    public static final Block TWILIGHT_PLANKS = registerBlock("twilight_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.BLUE)
                    .burnable()
            ));

    public static final Block TWILIGHT_SLAB = registerBlock("twilight_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TWILIGHT_PLANKS)));

    public static final Block TWILIGHT_STAIRS = registerBlock("twilight_stairs",
            new StairsBlock(FoxBlocks.TWILIGHT_PLANKS.getDefaultState(),
                    (AbstractBlock.Settings.copy(TWILIGHT_PLANKS))));

    public static final Block TWILIGHT_PRESSURE_PLATE = registerBlock("twilight_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(TWILIGHT_PLANKS)
                    .solid()
                    .noCollision()
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block TWILIGHT_BUTTON = registerBlock("twilight_button",
            new ButtonBlock(BlockSetType.CHERRY, 30,AbstractBlock.Settings.copy(TWILIGHT_PLANKS)
                    .solid()
                    .noCollision()
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block TWILIGHT_TRAPDOOR = registerBlock("twilight_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(TWILIGHT_PLANKS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block TWILIGHT_DOOR = registerBlock("twilight_door",
            new DoorBlock(BlockSetType.CHERRY,AbstractBlock.Settings.copy(TWILIGHT_PLANKS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block TWILIGHT_FENCE_GATE = registerBlock("twilight_fence_gate",
            new FenceGateBlock(WoodType.CHERRY,AbstractBlock.Settings.copy(TWILIGHT_PLANKS)));

    public static final Block TWILIGHT_FENCE = registerBlock("twilight_fence",
            new FenceBlock(AbstractBlock.Settings.copy(TWILIGHT_PLANKS)));

    public static final Block TWILIGHT_MOSAIC = registerBlock("twilight_mosaic",
            new Block(AbstractBlock.Settings.copy(TWILIGHT_PLANKS)));

    public static final Block TWILIGHT_MOSAIC_STAIRS = registerBlock("twilight_mosaic_stairs",
            new StairsBlock(FoxBlocks.TWILIGHT_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(TWILIGHT_MOSAIC))));

    public static final Block TWILIGHT_MOSAIC_SLAB = registerBlock("twilight_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TWILIGHT_MOSAIC)));

    public static final Block CUT_TWILIGHT_PLANKS = registerBlock("cut_twilight_planks",
            new Block(AbstractBlock.Settings.copy(TWILIGHT_PLANKS)));


    public static final Block SCARLET_LEAVES = registerBlock("scarlet_leaves",
            new ScarletLeavesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .strength(0.2F)
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.CHERRY_LEAVES)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
            ));

    public static final Block SCARLET_SAPLING = registerBlock("scarlet_sapling",
            new SaplingBlock(
                    FoxSaplingGenerators.SCARLET_TREE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.CHERRY_LEAVES)
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block ENV_CUBEMAP = registerBlock("env_cubemap",
            new CubeMapBlock(
                    AbstractBlock.Settings.create()
                            .replaceable()
                            .breakInstantly()
                            .noCollision()
                            .mapColor((MapColor.CLEAR))
                            .nonOpaque()
            ));

    public static final Block ROUTER_PLUSH = registerBlock("router_plush",
            new PlushBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GRAY)
                            .sounds(BlockSoundGroup.WOOL)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .breakInstantly()
                            .burnable()
            ));


    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Delphoxalis.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Delphoxalis.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerFoxBlocks() {
        Delphoxalis.LOGGER.info("Registering Blocks for " + Delphoxalis.MOD_ID);
    }
}
