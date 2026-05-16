package net.finnaware.delphoxalis.mixin;

import net.finnaware.delphoxalis.content.FoxEffects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Mouse.class)
public abstract class CameraLockMixin {
    @Shadow
    private double cursorDeltaX;

    @Shadow
    private double cursorDeltaY;

    @Inject(method = "updateMouse", at = @At("HEAD"), cancellable = true)
    private void delphoxalis$lockCamera(double timeDelta, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();

        if (client.player != null && client.player.hasStatusEffect(FoxEffects.CUBEMAP_BUILD)) {
            this.cursorDeltaX = 0.0D;
            this.cursorDeltaY = 0.0D;
            ci.cancel();
        }
    }
}
