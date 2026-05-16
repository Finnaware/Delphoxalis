package net.finnaware.delphoxalis.compat.vanillabackport;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;

import static net.finnaware.delphoxalis.content.FoxBlocks.registerBlock;

public class VBCompatBlocks {

    public static Block PALE_OAK_MOSAIC;
    public static Block PALE_OAK_MOSAIC_STAIRS;
    public static Block PALE_OAK_MOSAIC_SLAB;
    public static Block CUT_PALE_OAK_PLANKS;

    public static void register() {

    PALE_OAK_MOSAIC = registerBlock("pale_oak_mosaic",
            new Block(AbstractBlock.Settings.create()
                    .strength(2F, 3F)
                    .sounds(BlockSoundGroup.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WHITE)
            ));

    PALE_OAK_MOSAIC_STAIRS = registerBlock("pale_oak_mosaic_stairs",
            new StairsBlock(VBCompatBlocks.PALE_OAK_MOSAIC.getDefaultState(),
                    (AbstractBlock.Settings.copy(PALE_OAK_MOSAIC))));

    PALE_OAK_MOSAIC_SLAB = registerBlock("pale_oak_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PALE_OAK_MOSAIC)));

    CUT_PALE_OAK_PLANKS = registerBlock("cut_pale_oak_planks",
            new Block(AbstractBlock.Settings.copy(PALE_OAK_MOSAIC)));
    }
}
