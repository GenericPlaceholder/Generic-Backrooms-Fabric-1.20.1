package net.generic404_.genericbackrooms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.generic404_.genericbackrooms.GenericBackrooms;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item ALMONDWATER = registerItem("almondwater", new Item(new FabricItemSettings()));

	private static void addItemsToTab(FabricItemGroupEntries entries){
		entries.add(ALMONDWATER);
	}

	private static Item registerItem(String name, Item item){
		return Registry.register(Registries.ITEM, new Identifier(GenericBackrooms.MOD_ID, name), item);
	}

	public static void registerModItems(){
		GenericBackrooms.LOGGER.info("Registering Mod Items for " + GenericBackrooms.MOD_ID + ". God I love tutorials. Kaupenjoe absolutely saved me.");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToTab);
	}
}