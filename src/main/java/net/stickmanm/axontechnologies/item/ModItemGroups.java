package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup AXON_TECHNOLOGIES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AxonTechnologies.MOD_ID, "axontechnologies_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MIMICARIUM))
                    .displayName(Text.translatable("itemgroup.axontechnologies.axontechnologies_items"))
                    .entries(((displayContext, entries) -> {

                        //Items
                        entries.add(ModItems.MIMICARIUM);

                        //Blocks
                        entries.add(ModBlocks.MIMICARIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE);
                    }))





                    .build());

    public static void registerItemGroups() {
        AxonTechnologies.LOGGER.info("Registering Item Groups for " + AxonTechnologies.MOD_ID);
    }
}
