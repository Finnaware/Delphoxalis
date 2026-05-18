package net.finnaware.delphoxalis.mixin;

import net.fabricmc.loader.api.FabricLoader;
import net.finnaware.delphoxalis.compat.rangedweaponapi.RWCompatItems;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientPlayerEntity.class)
public class BowSlowdownMixin {
    @Unique
    private static final float WARBOW_MOVEMENT_MULTIPLIER = 0.1F;

    @ModifyConstant(method = "tickMovement", constant = @Constant(floatValue = 0.2F))
    private float delphoxalis$slowWarbowUseMovement(float original) {
        if (!FabricLoader.getInstance().isModLoaded("ranged_weapon_api")) {
            return original;
        }
        ClientPlayerEntity player = (ClientPlayerEntity)(Object)this;
        return player.getActiveItem().isOf(RWCompatItems.WARBOW) ? WARBOW_MOVEMENT_MULTIPLIER : original;
    }
}
