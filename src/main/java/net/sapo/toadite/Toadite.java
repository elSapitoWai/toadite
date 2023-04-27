package net.sapo.toadite;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.sapo.toadite.Entity.ModEntities;
import net.sapo.toadite.Entity.custom.ToadEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Toadite implements ModInitializer {
    public static final String MODID = "toadite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        FabricDefaultAttributeRegistry.register(ModEntities.TOAD, ToadEntity.setAttributes());
        LOGGER.info("Mod is initialized");
    }
}