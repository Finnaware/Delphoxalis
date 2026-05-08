package net.finnaware.delphoxalis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.finnaware.delphoxalis.block.FoxBlocks;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(FoxBlocks.ACACIA_MOSAIC);
        addDrop(FoxBlocks.ACACIA_MOSAIC_STAIRS);
        addDrop(FoxBlocks.ACACIA_MOSAIC_SLAB, slabDrops(FoxBlocks.ACACIA_MOSAIC_SLAB));
        addDrop(FoxBlocks.BIRCH_MOSAIC);
        addDrop(FoxBlocks.BIRCH_MOSAIC_STAIRS);
        addDrop(FoxBlocks.BIRCH_MOSAIC_SLAB, slabDrops(FoxBlocks.BIRCH_MOSAIC_SLAB));
        addDrop(FoxBlocks.CHERRY_MOSAIC);
        addDrop(FoxBlocks.CHERRY_MOSAIC_STAIRS);
        addDrop(FoxBlocks.CHERRY_MOSAIC_SLAB, slabDrops(FoxBlocks.CHERRY_MOSAIC_SLAB));
        addDrop(FoxBlocks.CRIMSON_MOSAIC);
        addDrop(FoxBlocks.CRIMSON_MOSAIC_STAIRS);
        addDrop(FoxBlocks.CRIMSON_MOSAIC_SLAB, slabDrops(FoxBlocks.CRIMSON_MOSAIC_SLAB));
        addDrop(FoxBlocks.DARK_OAK_MOSAIC);
        addDrop(FoxBlocks.DARK_OAK_MOSAIC_STAIRS);
        addDrop(FoxBlocks.DARK_OAK_MOSAIC_SLAB, slabDrops(FoxBlocks.DARK_OAK_MOSAIC_SLAB));
        addDrop(FoxBlocks.JUNGLE_MOSAIC);
        addDrop(FoxBlocks.JUNGLE_MOSAIC_STAIRS);
        addDrop(FoxBlocks.JUNGLE_MOSAIC_SLAB, slabDrops(FoxBlocks.JUNGLE_MOSAIC_SLAB));
        addDrop(FoxBlocks.MANGROVE_MOSAIC);
        addDrop(FoxBlocks.MANGROVE_MOSAIC_STAIRS);
        addDrop(FoxBlocks.MANGROVE_MOSAIC_SLAB, slabDrops(FoxBlocks.MANGROVE_MOSAIC_SLAB));
        addDrop(FoxBlocks.OAK_MOSAIC);
        addDrop(FoxBlocks.OAK_MOSAIC_STAIRS);
        addDrop(FoxBlocks.OAK_MOSAIC_SLAB, slabDrops(FoxBlocks.OAK_MOSAIC_SLAB));
        addDrop(FoxBlocks.SPRUCE_MOSAIC);
        addDrop(FoxBlocks.SPRUCE_MOSAIC_STAIRS);
        addDrop(FoxBlocks.SPRUCE_MOSAIC_SLAB, slabDrops(FoxBlocks.SPRUCE_MOSAIC_SLAB));
        addDrop(FoxBlocks.WARPED_MOSAIC);
        addDrop(FoxBlocks.WARPED_MOSAIC_STAIRS);
        addDrop(FoxBlocks.WARPED_MOSAIC_SLAB, slabDrops(FoxBlocks.WARPED_MOSAIC_SLAB));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
