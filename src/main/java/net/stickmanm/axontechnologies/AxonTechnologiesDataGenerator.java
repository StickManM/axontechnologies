package net.stickmanm.axontechnologies;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.stickmanm.axontechnologies.datagen.ModBlockTagProvider;
import net.stickmanm.axontechnologies.datagen.ModLootTableProvider;
import net.stickmanm.axontechnologies.datagen.ModModelProvider;
import net.stickmanm.axontechnologies.datagen.ModRecipeProvider;

public class AxonTechnologiesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		//pack.addProvider(ModWorldGenerator::new);
		//pack.addProvider(ModAdvancementGenerator::new);
	}
}
