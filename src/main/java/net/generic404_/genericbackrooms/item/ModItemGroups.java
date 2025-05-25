package net.generic404_.genericbackrooms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.generic404_.genericbackrooms.GenericBackrooms;
import net.generic404_.genericbackrooms.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BACKROOMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GenericBackrooms.MOD_ID, "almondwater"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.genericbackrooms"))
                    .icon(()->new ItemStack(ModItems.ALMONDWATER)).entries((displayContext, entries) -> {
                        //this is where you put items into the group
                        entries.add(ModItems.ALMONDWATER);
                        entries.add(ModBlocks.BLOCKZERO_WALL);
                        entries.add(ModBlocks.BLOCKZERO_FLOOR);
                        entries.add(ModBlocks.BLOCKZERO_CEILING);
                        entries.add(ModBlocks.FLUORESCENT);

                    }).build());

    public static void registerItemGroups(){
        GenericBackrooms.LOGGER.info("Registering Item Groups for " + GenericBackrooms.MOD_ID);
    }

}
