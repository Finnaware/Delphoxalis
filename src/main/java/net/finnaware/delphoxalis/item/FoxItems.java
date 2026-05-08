package net.finnaware.delphoxalis.item;

import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.item.custom.NetheriteMaceItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class FoxItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Delphoxalis.MOD_ID, name), item);
    }

    public static final Item NETHERITE_MACE = registerItem("netherite_mace", new NetheriteMaceItem(new Item.Settings()
            .fireproof()
            .rarity(Rarity.EPIC)
            .maxDamage(750)
            .component(DataComponentTypes.TOOL, MaceItem.createToolComponent())
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -3.4F))
    ));

    public static void registerFoxItems() {
        Delphoxalis.LOGGER.info("Registering Mod Items for " + Delphoxalis.MOD_ID);
    }
}
