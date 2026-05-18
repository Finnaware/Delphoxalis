package net.finnaware.delphoxalis.content;

import net.finnaware.delphoxalis.Delphoxalis;
import net.finnaware.delphoxalis.content.item.NetheriteMaceItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.MaceItem;
import net.minecraft.item.SignItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class FoxItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Delphoxalis.MOD_ID, name), item);
    }

    public static final Item NETHERITE_MACE = registerItem("netherite_mace", new NetheriteMaceItem(new Item.Settings()
            .fireproof()
            .rarity(Rarity.EPIC)
            .maxDamage(750)
            .component(DataComponentTypes.TOOL, MaceItem.createToolComponent())
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -3.4F))
    ));

    public static final Item PRODUCT_KEY = registerItem("product_key", new Item(new Item.Settings()
            .fireproof()
            .rarity(Rarity.EPIC)
    ));

    public static final Item TWILIGHT_SIGN = registerItem("twilight_sign",
            new SignItem(new Item.Settings().maxCount(16), FoxBlocks.TWILIGHT_SIGN, FoxBlocks.TWILIGHT_WALL_SIGN));

    public static final Item TWILIGHT_HANGING_SIGN = registerItem("twilight_hanging_sign",
            new HangingSignItem(FoxBlocks.TWILIGHT_HANGING_SIGN, FoxBlocks.TWILIGHT_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static void registerFoxItems() {
        Delphoxalis.LOGGER.info("Registering Items for " + Delphoxalis.MOD_ID);
    }
}
