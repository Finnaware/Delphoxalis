package net.finnaware.delphoxalis.mixin;

import net.finnaware.delphoxalis.content.FoxBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientWorld.class)
public class ClientWorldMixin {
    @Shadow
    @Final
    private MinecraftClient client;

    @Inject(method = "getBlockParticle", at = @At("RETURN"), cancellable = true)
    private void delphoxalis$showEnvCubemapMarkers(CallbackInfoReturnable<Block> cir) {
        if (cir.getReturnValue() != null || this.client.interactionManager == null || this.client.player == null) {
            return;
        }

        if (client.player.getMainHandStack().isOf(FoxBlocks.ENV_CUBEMAP.asItem())) {
            cir.setReturnValue(FoxBlocks.ENV_CUBEMAP);
        }
    }
}