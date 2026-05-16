package net.finnaware.delphoxalis.content.block;

import com.mojang.serialization.MapCodec;
import net.finnaware.delphoxalis.content.FoxParticles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class ScarletLeavesBlock extends LeavesBlock {
    public static final MapCodec<ScarletLeavesBlock> CODEC = createCodec(ScarletLeavesBlock::new);

    @Override
    public MapCodec<ScarletLeavesBlock> getCodec() {
        return CODEC;
    }

    public ScarletLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                ParticleUtil.spawnParticle(world, pos, random, FoxParticles.SCARLET_LEAVES);
            }
        }
    }
}
