package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class FoxLootTableModifiers {
    private static final Identifier TRIAL_SPAWNER_OMINOUS_RARE =
            Identifier.ofVanilla("chests/trial_chambers/reward_ominous_rare");

    public static void trialOminousRareTable() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (TRIAL_SPAWNER_OMINOUS_RARE.equals(key.getValue())) {

                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(FoxBlocks.ROUTER_PLUSH.asItem())
                                .weight(1))
                        .with(ItemEntry.builder(FoxBlocks.SCARLET_SAPLING.asItem())
                                .weight(1));
                tableBuilder.pool(pool);
            }
        });
    }

    public static void registerFoxLootTableModifiers() {
        Delphoxalis.LOGGER.info("Registering Loot Table Modifiers for " + Delphoxalis.MOD_ID);

        trialOminousRareTable();
    }
}