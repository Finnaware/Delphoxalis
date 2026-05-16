package net.finnaware.delphoxalis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.finnaware.delphoxalis.content.FoxBlocks;
import net.finnaware.delphoxalis.content.FoxItems;
import net.finnaware.delphoxalis.content.FoxParticles;
import net.finnaware.delphoxalis.content.particle.ScarletLeavesParticle;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class DelphoxalisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.SCARLET_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.SCARLET_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.ENV_CUBEMAP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FoxBlocks.ROUTER_PLUSH, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(FoxParticles.SCARLET_LEAVES, ScarletLeavesParticle.Factory::new);

        ModelPredicateProviderRegistry.register(FoxItems.WARBOW, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {return 0.0F;}
            return entity.getActiveItem() != stack ? 0.0F : (stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 45.0F;
        });
        ModelPredicateProviderRegistry.register(
                FoxItems.WARBOW,
                Identifier.ofVanilla("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
        );
    }
}
