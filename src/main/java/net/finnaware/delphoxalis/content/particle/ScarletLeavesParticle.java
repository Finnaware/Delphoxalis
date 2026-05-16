package net.finnaware.delphoxalis.content.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;

public class ScarletLeavesParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected ScarletLeavesParticle(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider) {
        super(world, x, y, z);
        this.spriteProvider = spriteProvider;
        this.maxAge = 80 + this.random.nextInt(40);
        this.gravityStrength = 0.04F;
        this.velocityMultiplier = 0.98F;
        this.scale = 0.08F + this.random.nextFloat() * 0.04F;
        this.velocityX = (this.random.nextDouble() - 0.5D) * 0.02D;
        this.velocityY = -0.02D;
        this.velocityZ = (this.random.nextDouble() - 0.5D) * 0.02D;
        this.setSprite(spriteProvider);
    }

    @Override
    public void tick() {
        super.tick();
        this.velocityX += Math.sin((this.age + this.random.nextFloat()) * 0.25D) * 0.001D;
        this.velocityZ += Math.cos((this.age + this.random.nextFloat()) * 0.25D) * 0.001D;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientWorld world, double x, double y, double z,
                                       double velocityX, double velocityY, double velocityZ) {
            return new ScarletLeavesParticle(world, x, y, z, this.spriteProvider);
        }
    }
}
