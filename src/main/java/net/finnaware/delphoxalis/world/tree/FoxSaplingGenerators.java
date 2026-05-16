package net.finnaware.delphoxalis.world.tree;

import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.world.FoxConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class FoxSaplingGenerators {
    public static final SaplingGenerator SCARLET_TREE = new SaplingGenerator(Delphoxalis.MOD_ID + ":scarlet_tree",
            Optional.empty(), Optional.of(FoxConfiguredFeatures.SCARLET_TREE_KEY), Optional.empty());
}