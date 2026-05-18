package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.compat.rangedweaponapi.RWCompatItems;
import net.finnaware.delphoxalis.compat.vanillabackport.VBCompatBlocks;
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
                    .icon(() -> new ItemStack(FoxBlocks.SCARLET_SAPLING))
                    .displayName(Text.translatable("itemgroup.delphoxalis.delphoxalis_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(FoxItems.NETHERITE_MACE);
                        if (FabricLoader.getInstance().isModLoaded("ranged_weapon_api")) {
                            entries.add(RWCompatItems.WARBOW);
                        }
                        entries.add(FoxItems.PRODUCT_KEY);
                        entries.add(FoxBlocks.ENV_CUBEMAP);
                        entries.add(FoxBlocks.ROUTER_PLUSH);
                        entries.add(FoxBlocks.DEV_MEASURE_1_GRAY);
                        entries.add(FoxBlocks.DEV_MEASURE_2_GRAY);
                        entries.add(FoxBlocks.DEV_MEASURE_3_GRAY);
                        entries.add(FoxBlocks.DEV_MEASURE_GRAY_DOOR);
                        entries.add(FoxBlocks.DEV_MEASURE_1_ORANGE);
                        entries.add(FoxBlocks.DEV_MEASURE_2_ORANGE);
                        entries.add(FoxBlocks.DEV_MEASURE_3_ORANGE);
                        entries.add(FoxBlocks.DEV_MEASURE_ORANGE_DOOR);
                        entries.add(FoxBlocks.TILE_FLOOR);
                        entries.add(FoxBlocks.TILE_FLOOR_STAIRS);
                        entries.add(FoxBlocks.TILE_FLOOR_SLAB);
                        entries.add(FoxBlocks.MISSING_TEXTURE);
                        entries.add(FoxBlocks.MISSING_TEXTURE_STAIRS);
                        entries.add(FoxBlocks.MISSING_TEXTURE_SLAB);
                        entries.add(FoxBlocks.CUT_OAK_PLANKS);
                        entries.add(FoxBlocks.OAK_MOSAIC);
                        entries.add(FoxBlocks.OAK_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.OAK_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_SPRUCE_PLANKS);
                        entries.add(FoxBlocks.SPRUCE_MOSAIC);
                        entries.add(FoxBlocks.SPRUCE_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.SPRUCE_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_BIRCH_PLANKS);
                        entries.add(FoxBlocks.BIRCH_MOSAIC);
                        entries.add(FoxBlocks.BIRCH_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.BIRCH_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_JUNGLE_PLANKS);
                        entries.add(FoxBlocks.JUNGLE_MOSAIC);
                        entries.add(FoxBlocks.JUNGLE_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.JUNGLE_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_ACACIA_PLANKS);
                        entries.add(FoxBlocks.ACACIA_MOSAIC);
                        entries.add(FoxBlocks.ACACIA_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.ACACIA_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_DARK_OAK_PLANKS);
                        entries.add(FoxBlocks.DARK_OAK_MOSAIC);
                        entries.add(FoxBlocks.DARK_OAK_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.DARK_OAK_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_MANGROVE_PLANKS);
                        entries.add(FoxBlocks.MANGROVE_MOSAIC);
                        entries.add(FoxBlocks.MANGROVE_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.MANGROVE_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_CHERRY_PLANKS);
                        entries.add(FoxBlocks.CHERRY_MOSAIC);
                        entries.add(FoxBlocks.CHERRY_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.CHERRY_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_CRIMSON_PLANKS);
                        entries.add(FoxBlocks.CRIMSON_MOSAIC);
                        entries.add(FoxBlocks.CRIMSON_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.CRIMSON_MOSAIC_SLAB);
                        entries.add(FoxBlocks.CUT_WARPED_PLANKS);
                        entries.add(FoxBlocks.WARPED_MOSAIC);
                        entries.add(FoxBlocks.WARPED_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.WARPED_MOSAIC_SLAB);
                        if (FabricLoader.getInstance().isModLoaded("vanillabackport")) {
                            entries.add(VBCompatBlocks.CUT_PALE_OAK_PLANKS);
                            entries.add(VBCompatBlocks.PALE_OAK_MOSAIC);
                            entries.add(VBCompatBlocks.PALE_OAK_MOSAIC_STAIRS);
                            entries.add(VBCompatBlocks.PALE_OAK_MOSAIC_SLAB);
                        }
                        entries.add(FoxBlocks.CUT_BAMBOO_PLANKS);
                        entries.add(FoxBlocks.TWILIGHT_LOG);
                        entries.add(FoxBlocks.STRIPPED_TWILIGHT_LOG);
                        entries.add(FoxBlocks.TWILIGHT_WOOD);
                        entries.add(FoxBlocks.STRIPPED_TWILIGHT_WOOD);
                        entries.add(FoxBlocks.CUT_TWILIGHT_PLANKS);
                        entries.add(FoxBlocks.TWILIGHT_PLANKS);
                        entries.add(FoxBlocks.TWILIGHT_STAIRS);
                        entries.add(FoxBlocks.TWILIGHT_SLAB);
                        entries.add(FoxBlocks.TWILIGHT_MOSAIC);
                        entries.add(FoxBlocks.TWILIGHT_MOSAIC_STAIRS);
                        entries.add(FoxBlocks.TWILIGHT_MOSAIC_SLAB);
                        entries.add(FoxBlocks.TWILIGHT_PRESSURE_PLATE);
                        entries.add(FoxBlocks.TWILIGHT_BUTTON);
                        entries.add(FoxBlocks.TWILIGHT_TRAPDOOR);
                        entries.add(FoxBlocks.TWILIGHT_DOOR);
                        entries.add(FoxBlocks.TWILIGHT_FENCE);
                        entries.add(FoxBlocks.TWILIGHT_FENCE_GATE);
                        entries.add(FoxItems.TWILIGHT_SIGN);
                        entries.add(FoxItems.TWILIGHT_HANGING_SIGN);
                        entries.add(FoxBlocks.SCARLET_LEAVES);
                        entries.add(FoxBlocks.SCARLET_SAPLING);
                    }).build()
    );

    public static void registerFoxGroups() {
        Delphoxalis.LOGGER.info("Registering Item Groups for " + Delphoxalis.MOD_ID);
    }
}
