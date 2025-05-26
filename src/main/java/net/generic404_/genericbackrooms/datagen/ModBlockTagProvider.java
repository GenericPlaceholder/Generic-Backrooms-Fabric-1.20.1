package net.generic404_.genericbackrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.generic404_.genericbackrooms.block.ModBlocks;
import net.generic404_.genericbackrooms.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg){
        getOrCreateTagBuilder(ModTags.Blocks.CORRUPTIBLE)
                .add(ModBlocks.BLOCKZERO_WALL)
                .add(ModBlocks.BLOCKZERO_CEILING)
                .add(ModBlocks.BLOCKZERO_FLOOR)
                .add(ModBlocks.FLUORESCENT);
    }
}