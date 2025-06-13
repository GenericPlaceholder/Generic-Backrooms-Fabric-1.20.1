package net.generic404_.genericbackrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.generic404_.genericbackrooms.block.ModBlocks;
import net.generic404_.genericbackrooms.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCKZERO_CEILING);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCKZERO_FLOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCKZERO_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ALMONDWATER, Models.GENERATED);
    }
}
