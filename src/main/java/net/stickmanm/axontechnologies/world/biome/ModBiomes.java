package net.stickmanm.axontechnologies.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeAdditionsSound;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.*;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModBiomes {
    public static final RegistryKey<Biome> THUNDERED_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"thundered_plains"));
    public static final RegistryKey<Biome> CORRUPTED_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"corrupted_plains"));
    public static final RegistryKey<Biome> DREAD_WASTES_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"dread_wastes"));
    public static final RegistryKey<Biome> MIMIC_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"mimic_plains"));
    public static final RegistryKey<Biome> MIMIC_DESERT_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"mimic_desert"));
    public static final RegistryKey<Biome> MIMIC_BAMBOO_JUNGLE_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"mimic_bamboo_jungle"));
    public static final RegistryKey<Biome> MIMIC_FOREST_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"mimic_forest"));
    public static final RegistryKey<Biome> MIMIC_TAIGA_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"mimic_taiga"));
    public static final RegistryKey<Biome> MIMIC_SWAMP_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID,"mimic_swamp"));
    public static final RegistryKey<Biome> MIMIC_SNOWY_TAIGA_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(AxonTechnologies.MOD_ID, "mimic_snowy_taiga"));

    public static void registerModBiomes(){
        AxonTechnologies.LOGGER.info("Registering Mod Biomes for " + AxonTechnologies.MOD_ID);

    }

}
