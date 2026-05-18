package net.finnaware.delphoxalis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.finnaware.delphoxalis.content.FoxBlocks;
import net.finnaware.delphoxalis.content.FoxParticles;
import net.finnaware.delphoxalis.content.particle.ScarletLeavesParticle;
import net.minecraft.client.render.RenderLayer;

public class DelphoxalisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.SCARLET_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.SCARLET_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.ENV_CUBEMAP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.ROUTER_PLUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.POTTED_SCARLET_SAPLING, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(FoxParticles.SCARLET_LEAVES, ScarletLeavesParticle.Factory::new);
    }
}
