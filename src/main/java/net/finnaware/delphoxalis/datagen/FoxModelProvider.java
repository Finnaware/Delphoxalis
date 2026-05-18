package net.finnaware.delphoxalis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.finnaware.delphoxalis.content.FoxBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;


public class FoxModelProvider extends FabricModelProvider {
    public FoxModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerFlowerPotPlant(
                FoxBlocks.SCARLET_SAPLING,
                FoxBlocks.POTTED_SCARLET_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}