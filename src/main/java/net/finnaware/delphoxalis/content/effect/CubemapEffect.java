package net.finnaware.delphoxalis.content.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Map;
import java.util.WeakHashMap;

public class CubemapEffect extends StatusEffect {
    private static final int TICKS_PER_DIRECTION = 40;
    private static final Map<PlayerEntity, CubemapState> CUBEMAP_STATES = new WeakHashMap<>();
    private static final CubemapDirection[] CUBEMAP_CYCLE = {new CubemapDirection(0.0F, -90.0F),   // up
            new CubemapDirection(0.0F, 90.0F),    // down
            new CubemapDirection(180.0F, 0.0F),   // north
            new CubemapDirection(90.0F, 0.0F),    // west
            new CubemapDirection(0.0F, 0.0F),     // south
            new CubemapDirection(-90.0F, 0.0F)    // east
    };

    public CubemapEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            CubemapBuild(player);
        }
        return true;
    }

    private static void CubemapBuild(PlayerEntity player) {
        CubemapState state = CUBEMAP_STATES.getOrDefault(player, new CubemapState(0, 0));
        CubemapDirection direction = CUBEMAP_CYCLE[state.step()];

        player.setYaw(direction.yaw());
        player.setPitch(direction.pitch());
        player.setHeadYaw(direction.yaw());
        player.setBodyYaw(direction.yaw());
        player.prevYaw = direction.yaw();
        player.prevPitch = direction.pitch();

        int ticksOnStep = state.ticksOnStep() + 1;
        int step = state.step();

        if (ticksOnStep >= TICKS_PER_DIRECTION) {
            ticksOnStep = 0;
            step = (step + 1) % CUBEMAP_CYCLE.length;
        }

        CUBEMAP_STATES.put(player, new CubemapState(step, ticksOnStep));
    }

    private record CubemapDirection(float yaw, float pitch) {
    }

    private record CubemapState(int step, int ticksOnStep) {
    }
}
