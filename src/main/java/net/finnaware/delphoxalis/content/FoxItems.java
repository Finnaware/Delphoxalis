package net.finnaware.delphoxalis.content;

import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.content.item.NetheriteMaceItem;
import net.finnaware.delphoxalis.content.item.WarbowItem;
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

    public static final Item WARBOW = registerItem("warbow", new WarbowItem(new Item.Settings()
            .maxDamage(654)
    ));

    public static final Item PRODUCT_KEY = registerItem("product_key", new Item(new Item.Settings()
            .fireproof()
            .rarity(Rarity.EPIC)
    ));

    public static void registerFoxItems() {
        Delphoxalis.LOGGER.info("Registering Items for " + Delphoxalis.MOD_ID);
    }
}
