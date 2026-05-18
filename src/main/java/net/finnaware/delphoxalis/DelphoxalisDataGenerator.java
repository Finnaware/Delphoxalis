package net.finnaware.delphoxalis;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.finnaware.delphoxalis.datagen.*;

public class DelphoxalisDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(FoxBlockTagProvider::new);
        pack.addProvider(FoxItemTagProvider::new);
        pack.addProvider(FoxLootTableProvider::new);
        pack.addProvider(FoxModelProvider::new);
        pack.addProvider(FoxRecipeProvider::new);
	}
}
