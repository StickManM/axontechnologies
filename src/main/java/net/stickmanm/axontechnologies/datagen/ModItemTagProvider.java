package net.stickmanm.axontechnologies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.stickmanm.axontechnologies.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider<Item> {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.THUNDERANIUM_PICKAXE)
                .add(ModItems.RED_THUNDERANIUM_PICKAXE)
                .add(ModItems.DARK_THUNDERANIUM_PICKAXE)
                .add(ModItems.CORRUPTINITE_PICKAXE)
                .add(ModItems.AXON_ALLOY_PICKAXE)
                .add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE)
                .add(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE)
                .add(ModItems.RAZZORIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.THUNDERANIUM_SWORD)
                .add(ModItems.RED_THUNDERANIUM_SWORD)
                .add(ModItems.ANTIGLITCH_SWORD)
                .add(ModItems.DARK_THUNDERANIUM_SWORD)
                .add(ModItems.CORRUPTINITE_SWORD)
                .add(ModItems.AXON_ALLOY_SWORD)
                .add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD)
                .add(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD)
                .add(ModItems.RAZZOR)
                .add(ModItems.TICKLE_TRAVIS_TICKLER)
                .add(ModItems.BOMB_STICK)
                .add(ModItems.NEMESIS_COMMANDO_BLADE)
                .add(ModItems.NOKIA_HAMMER);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.THUNDERANIUM_AXE)
                .add(ModItems.RED_THUNDERANIUM_AXE)
                .add(ModItems.DARK_THUNDERANIUM_AXE)
                .add(ModItems.CORRUPTINITE_AXE)
                .add(ModItems.AXON_ALLOY_AXE)
                .add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE)
                .add(ModItems.CORRUPTINITE_AXON_ALLOY_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.THUNDERANIUM_SHOVEL)
                .add(ModItems.RED_THUNDERANIUM_SHOVEL)
                .add(ModItems.DARK_THUNDERANIUM_SHOVEL)
                .add(ModItems.CORRUPTINITE_SHOVEL)
                .add(ModItems.AXON_ALLOY_SHOVEL)
                .add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL)
                .add(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.THUNDERANIUM_HOE)
                .add(ModItems.RED_THUNDERANIUM_HOE)
                .add(ModItems.DARK_THUNDERANIUM_HOE)
                .add(ModItems.CORRUPTINITE_HOE)
                .add(ModItems.AXON_ALLOY_HOE)
                .add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE)
                .add(ModItems.CORRUPTINITE_AXON_ALLOY_HOE)
                .add(ModItems.VANILLA_HOE)
                .add(ModItems.ULTIMATE_HOE_TROPHY);

    }
}
