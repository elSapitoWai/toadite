package net.sapo.toadite.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sapo.toadite.Toadite;

public class ModItemGroups {
    public static ItemGroup TOADITE;

    public static void registerItemGroups() {
        TOADITE = FabricItemGroup.builder(new Identifier(Toadite.MODID, "toadite_group"))
                .displayName(Text.translatable("itemgroup.toadite_group"))
                .icon(() -> new ItemStack(ModItems.TOAD_SPAWN_EGG)).build();
    }
}
