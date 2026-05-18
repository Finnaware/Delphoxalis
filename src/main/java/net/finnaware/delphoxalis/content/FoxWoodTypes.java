package net.finnaware.delphoxalis.content;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.finnaware.delphoxalis.Delphoxalis;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class FoxWoodTypes {
    public static final BlockSetType TWILIGHT_BLOCK_SET = BlockSetTypeBuilder.copyOf(BlockSetType.CHERRY)
            .register(Identifier.of(Delphoxalis.MOD_ID, "twilight"));

    public static final WoodType TWILIGHT_WOOD = WoodTypeBuilder.copyOf(WoodType.CHERRY)
            .register(Identifier.of(Delphoxalis.MOD_ID, "twilight"), TWILIGHT_BLOCK_SET);

    public static void registerFoxWoodTypes() {
        Delphoxalis.LOGGER.info("Registering Wood Types for " + Delphoxalis.MOD_ID);
    }
}
