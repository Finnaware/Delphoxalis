package net.finnaware.delphoxalis.content.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MaceItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class NetheriteMaceItem extends MaceItem {
    public NetheriteMaceItem(Settings settings) {
        super(settings);
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public boolean canRepair(ItemStack stack,
                             ItemStack ingredient) {
        return ingredient.isOf(Items.NETHERITE_INGOT);
    }

    @Override
    public float getBonusAttackDamage(Entity target,
                                      float baseAttackDamage,
                                      DamageSource damageSource) {
        float extraDamage = super.getBonusAttackDamage(
                target,
                baseAttackDamage,
                damageSource
        );

        return extraDamage * 1.2F;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.delphoxalis.netherite_mace"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}