package net.sapo.toadite;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.sapo.toadite.Entity.ModEntities;
import net.sapo.toadite.Entity.client.ToadRenderer;

public class ToaditeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TOAD, ToadRenderer::new);
    }
}
