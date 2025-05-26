package net.generic404_.genericbackrooms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.generic404_.genericbackrooms.GenericBackrooms;
import net.generic404_.genericbackrooms.block.lighting.Fluorescent;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLOCKZERO_WALL = registerBlock("blockzero_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOL).mapColor(MapColor.YELLOW)));
    public static final Block BLOCKZERO_FLOOR = registerBlock("blockzero_floor",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.WOOL).mapColor(MapColor.PALE_YELLOW)));
    public static final Block BLOCKZERO_CEILING = registerBlock("blockzero_ceiling",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.METAL).mapColor(MapColor.IRON_GRAY)));
    public static final Block FLUORESCENT = registerBlock("fluorescent",
            new Fluorescent(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.LANTERN).mapColor(MapColor.OFF_WHITE).luminance(15)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GenericBackrooms.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(GenericBackrooms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        GenericBackrooms.LOGGER.info("Registering ModBlocks for " + GenericBackrooms.MOD_ID);
    }
}
