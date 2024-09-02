package net.stickmanm.axontechnologies;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModFuels;
import net.stickmanm.axontechnologies.item.ModItemGroups;
import net.stickmanm.axontechnologies.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AxonTechnologies implements ModInitializer {
	public static final String MOD_ID = "axontechnologies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFuels.registerModFuels();
	}
}