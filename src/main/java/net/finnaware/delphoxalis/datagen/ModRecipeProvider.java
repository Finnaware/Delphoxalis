package net.finnaware.delphoxalis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.finnaware.delphoxalis.item.FoxItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerMosaicRecipe(exporter, FoxBlocks.ACACIA_MOSAIC, Blocks.ACACIA_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.BIRCH_MOSAIC, Blocks.BIRCH_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.CHERRY_MOSAIC, Blocks.CHERRY_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.CRIMSON_MOSAIC, Blocks.CRIMSON_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.DARK_OAK_MOSAIC, Blocks.DARK_OAK_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.JUNGLE_MOSAIC, Blocks.JUNGLE_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.MANGROVE_MOSAIC, Blocks.MANGROVE_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.OAK_MOSAIC, Blocks.OAK_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.SPRUCE_MOSAIC, Blocks.SPRUCE_SLAB);
        offerMosaicRecipe(exporter, FoxBlocks.WARPED_MOSAIC, Blocks.WARPED_SLAB);

        offerMosaicVariantRecipes(exporter, FoxBlocks.ACACIA_MOSAIC, FoxBlocks.ACACIA_MOSAIC_STAIRS, FoxBlocks.ACACIA_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.BIRCH_MOSAIC, FoxBlocks.BIRCH_MOSAIC_STAIRS, FoxBlocks.BIRCH_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.CHERRY_MOSAIC, FoxBlocks.CHERRY_MOSAIC_STAIRS, FoxBlocks.CHERRY_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.CRIMSON_MOSAIC, FoxBlocks.CRIMSON_MOSAIC_STAIRS, FoxBlocks.CRIMSON_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.DARK_OAK_MOSAIC, FoxBlocks.DARK_OAK_MOSAIC_STAIRS, FoxBlocks.DARK_OAK_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.JUNGLE_MOSAIC, FoxBlocks.JUNGLE_MOSAIC_STAIRS, FoxBlocks.JUNGLE_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.MANGROVE_MOSAIC, FoxBlocks.MANGROVE_MOSAIC_STAIRS, FoxBlocks.MANGROVE_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.OAK_MOSAIC, FoxBlocks.OAK_MOSAIC_STAIRS, FoxBlocks.OAK_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.SPRUCE_MOSAIC, FoxBlocks.SPRUCE_MOSAIC_STAIRS, FoxBlocks.SPRUCE_MOSAIC_SLAB);
        offerMosaicVariantRecipes(exporter, FoxBlocks.WARPED_MOSAIC, FoxBlocks.WARPED_MOSAIC_STAIRS, FoxBlocks.WARPED_MOSAIC_SLAB);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), //Template
                        Ingredient.ofItems(Items.MACE), //Item
                        Ingredient.ofItems(Blocks.NETHERITE_BLOCK), //Ingredient
                        RecipeCategory.COMBAT,
                        FoxItems.NETHERITE_MACE
                ).criterion(hasItem(Items.MACE), conditionsFromItem(Items.MACE))
                .offerTo(exporter, Identifier.of("delphoxalis", "mace_to_netherite_mace"));
    }

    private void offerMosaicRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .pattern("#")
                .pattern("#")
                .input('#', slab)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);
    }

    private void offerMosaicVariantRecipes(RecipeExporter exporter, ItemConvertible mosaic, ItemConvertible stairs, ItemConvertible slab) {
        createStairsRecipe(stairs, Ingredient.ofItems(mosaic))
                .criterion(hasItem(mosaic), conditionsFromItem(mosaic))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, mosaic);
    }

}
