package net.generic404_.genericbackrooms;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.generic404_.genericbackrooms.datagen.ModBlockTagProvider;
import net.generic404_.genericbackrooms.datagen.ModItemTagProvider;
import net.generic404_.genericbackrooms.datagen.ModModelProvider;

public class GenericBackroomsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
