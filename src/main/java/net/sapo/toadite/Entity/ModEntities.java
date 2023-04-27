package net.sapo.toadite.Entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sapo.toadite.Entity.custom.ToadEntity;
import net.sapo.toadite.Toadite;

public class ModEntities {
    public static final EntityType<ToadEntity> TOAD = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Toadite.MODID, "toad"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ToadEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.4f)).build());
}
