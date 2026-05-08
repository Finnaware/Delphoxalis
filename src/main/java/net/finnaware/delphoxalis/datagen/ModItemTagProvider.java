package net.finnaware.delphoxalis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.finnaware.delphoxalis.item.FoxItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(FoxBlocks.CRIMSON_MOSAIC.asItem())
                .add(FoxBlocks.CRIMSON_MOSAIC_STAIRS.asItem())
                .add(FoxBlocks.CRIMSON_MOSAIC_SLAB.asItem())
                .add(FoxBlocks.WARPED_MOSAIC.asItem())
                .add(FoxBlocks.WARPED_MOSAIC_STAIRS.asItem())
                .add(FoxBlocks.WARPED_MOSAIC_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(FoxItems.NETHERITE_MACE);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(FoxItems.NETHERITE_MACE);
        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(FoxItems.NETHERITE_MACE);
        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .add(FoxItems.NETHERITE_MACE);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(FoxItems.NETHERITE_MACE);
        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .add(FoxItems.NETHERITE_MACE);
    }
}
