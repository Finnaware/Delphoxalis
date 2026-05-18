package net.finnaware.delphoxalis.compat.rangedweaponapi;

import net.fabric_extras.ranged_weapon.api.CustomBow;
import net.fabric_extras.ranged_weapon.api.RangedConfig;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

import static net.finnaware.delphoxalis.content.FoxItems.registerItem;

public class RWCompatItems {

    public static Item WARBOW;

    public static void register() {
        WARBOW = registerItem("warbow", new CustomBow(
                new Item.Settings().maxDamage(636),
                new RangedConfig(18, 1.25F, 0),
                () -> Ingredient.ofItems(Items.STICK)
        ));
    }
}
