package net.finnaware.delphoxalis.mixin;

import net.finnaware.delphoxalis.content.FoxItems;
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
        ClientPlayerEntity player = (ClientPlayerEntity)(Object)this;
        return player.getActiveItem().isOf(FoxItems.WARBOW) ? WARBOW_MOVEMENT_MULTIPLIER : original;
    }
}