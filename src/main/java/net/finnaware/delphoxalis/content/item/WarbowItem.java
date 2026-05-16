package net.finnaware.delphoxalis.content.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.BowItem;
import org.jetbrains.annotations.Nullable;

public class WarbowItem extends BowItem {
    public WarbowItem(Settings settings) {
        super(settings);
    }

    @Override
    protected void shoot(LivingEntity shooter, ProjectileEntity projectile, int index, float speed, float divergence, float yaw, @Nullable LivingEntity target) {
        projectile.setVelocity(shooter, shooter.getPitch(), shooter.getYaw() + yaw, 0.0F, speed, divergence);
        if (projectile instanceof PersistentProjectileEntity arrow) {
            arrow.setDamage(arrow.getDamage() * 3.0F); // Arrow damage control
        }
    }

    public static float getPullProgress(int useTicks) {
        float f = useTicks / 45.0F; // Bow draw control
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }
        return f;
    }
}
