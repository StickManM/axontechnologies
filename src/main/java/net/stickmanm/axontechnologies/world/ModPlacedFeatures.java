package net.stickmanm.axontechnologies.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MIMICARIUM_ORE_PLACED_KEY = registerKey("mimicarium_ore");
    public static final RegistryKey<PlacedFeature> FAKESTONES_IRON_ORE_PLACED_KEY = registerKey("fakestones_iron_ore");
    public static final RegistryKey<PlacedFeature> FAKESTONES_GOLD_ORE_PLACED_KEY = registerKey("fakestones_gold_ore");
    public static final RegistryKey<PlacedFeature> VOIDSTONE_ORE_PLACED_KEY = registerKey("voidstone");
    public static final RegistryKey<PlacedFeature> DIMENSION_CORE_PLACED_KEY = registerKey("dimension_core_ore");
    public static final RegistryKey<PlacedFeature> DREADSTONE_DIAMOND_ORE_PLACED_KEY = registerKey("dreadstone_diamond_ore");
    public static final RegistryKey<PlacedFeature> DREADSTONE_NETHERITE_ORE_PLACED_KEY = registerKey("dreadstone_netherite_ore");
    public static final RegistryKey<PlacedFeature> DREADSTONE_THUNDERANIUM_ORE_PLACED_KEY = registerKey("dreadstone_thunderanium_ore");
    public static final RegistryKey<PlacedFeature> VOID_COAL_ORE_PLACED_KEY = registerKey("void_coal_ore");
    public static final RegistryKey<PlacedFeature> RENDERIUM_ORE_PLACED_KEY = registerKey("renderium_ore");
    public static final RegistryKey<PlacedFeature> THUNDERANIUM_ORE_PLACED_KEY = registerKey("thunderanium_ore");
    public static final RegistryKey<PlacedFeature> CORRUPTION_BLOCK_ORE_PLACED_KEY = registerKey("corruption_block_ore");
    public static final RegistryKey<PlacedFeature> DENDERIUM_ORE_PLACED_KEY = registerKey("denderium_ore");
    public static final RegistryKey<PlacedFeature> CORRUPTINITE_ORE_PLACED_KEY = registerKey("corruptinite_ore");
    //public static final RegistryKey<PlacedFeature> ORE_LIQUID_THUNDER_PLACED_KEY = registerKey("ore_liquid_thunder");
    //public static final RegistryKey<PlacedFeature> ORE_LIQUID_CORRUPTION_PLACED_KEY = registerKey("ore_liquid_corruption");
    //public static final RegistryKey<PlacedFeature> THUNDERED_TREE_PLACED_KEY = registerKey("thundered_tree_placed");




    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, MIMICARIUM_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.MIMICARIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.belowTop(100))));

        register(context, FAKESTONES_IRON_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.FAKESTONES_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(64, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.belowTop(100))));

        register(context, FAKESTONES_GOLD_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.FAKESTONES_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(50, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.belowTop(100))));

        register(context, VOIDSTONE_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.VOIDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(50, // Veins per5 Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(1), YOffset.belowTop(300))));

        register(context, DIMENSION_CORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.DIMENSION_CORE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.belowTop(200))));

        //DREADSTONE ORES
        register(context, DREADSTONE_DIAMOND_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.DREADSTONE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

        register(context, DREADSTONE_NETHERITE_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.DREADSTONE_NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(19, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

        register(context, DREADSTONE_THUNDERANIUM_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.DREADSTONE_THUNDERANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

        register(context, VOID_COAL_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.VOID_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(27, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

        //Thunderlands
        register(context, RENDERIUM_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.RENDERIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(100))));

        register(context, THUNDERANIUM_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.THUNDERANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(40, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(50))));

        register(context, CORRUPTION_BLOCK_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.CORRUPTION_BLOCK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(25, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(370))));

        /*register(context, ORE_LIQUID_THUNDER_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.ORE_LIQUID_THUNDER_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(50))));*/

        //Corruptionlands
        register(context, DENDERIUM_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.DENDERIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(100))));

        register(context, CORRUPTINITE_ORE_PLACED_KEY, registryLookup.getOrThrow(ModConfiguredFeatures.CORRUPTINITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(50))));

        /*register(context, ORE_LIQUID_CORRUPTION_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_LIQUID_CORRUPTION_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(50))));



        register(context, THUNDERED_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.THUNDERED_SAPLING_KEY),
                PlacedFeatures.createCountExtraModifier(1, 0.1f,2), PlacedFeatures.wouldSurvive(ModBlocks.THUNDERED_SAPLING));*/
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, AxonTechnologies.id(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }
}
