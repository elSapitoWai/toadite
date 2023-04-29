package net.sapo.toadite.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.sapo.toadite.Block.ModBlocks;
import net.sapo.toadite.Item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TOADITE_ORE, oreDrops(ModBlocks.TOADITE_ORE, ModItems.TOADITE));
        addDrop(ModBlocks.DEEPSLATE_TOADITE_ORE, oreDrops(ModBlocks.DEEPSLATE_TOADITE_ORE, ModItems.TOADITE));
    }
}
