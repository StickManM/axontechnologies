package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModFuels {
    public static void registerModFuels(){
        FuelRegistry.INSTANCE.add(ModItems.THUNDER_FUEL, 7200000);
        FuelRegistry.INSTANCE.add(ModItems.VOID_COAL, 72000);
        FuelRegistry.INSTANCE.add(ModBlocks.VOID_COAL_BLOCK, 720000);
        //FuelRegistry.INSTANCE.add(ModItems.LIQUID_LIFE_ESSENCE_BUCKET, 545642100);

    }
}
 