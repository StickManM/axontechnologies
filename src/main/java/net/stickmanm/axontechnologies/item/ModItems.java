package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModItems {

    public static final Item MIMICARIUM = registerItem("mimicarium",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AxonTechnologies.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AxonTechnologies.LOGGER.info("Registering Mod Items for " + AxonTechnologies.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(MIMICARIUM);
        });
    }
}
