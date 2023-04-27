package net.sapo.toadite.Item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sapo.toadite.Entity.ModEntities;
import net.sapo.toadite.Toadite;

public class ModItems {
    public static final Item TOAD_SPAWN_EGG = registerItem("toad_spawn_egg", new SpawnEggItem(ModEntities.TOAD,
            0x462c11, 0x464111, new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Toadite.MODID, name), item);
    }
}
