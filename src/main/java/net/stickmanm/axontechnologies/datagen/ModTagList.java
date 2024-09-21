package net.stickmanm.axontechnologies.datagen;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModTagList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_TOOL_LEVEL_5 = TagKey.of(RegistryKeys.BLOCK, AxonTechnologies.id(("incorrect_for_tool_level_5")));
        public static final TagKey<Block> INCORRECT_FOR_TOOL_LEVEL_6 = TagKey.of(RegistryKeys.BLOCK, AxonTechnologies.id(("incorrect_for_tool_level_6")));
        public static final TagKey<Block> INCORRECT_FOR_TOOL_LEVEL_7 = TagKey.of(RegistryKeys.BLOCK, AxonTechnologies.id(("incorrect_for_tool_level_7")));
        public static final TagKey<Block> INCORRECT_FOR_TOOL_LEVEL_10 = TagKey.of(RegistryKeys.BLOCK, AxonTechnologies.id(("incorrect_for_tool_level_10")));
        public static final TagKey<Block> INCORRECT_FOR_TOOL_LEVEL_INFINITE = TagKey.of(RegistryKeys.BLOCK, AxonTechnologies.id(("incorrect_for_tool_level_infinite")));

        public static final TagKey<Block> NEEDS_TOOL_LEVEL_4 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_5 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_5"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_6 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_6"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_7 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_7"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_8 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_8"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_9 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_9"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_10 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_10"));
        public static final TagKey<Block> NEEDS_TOOL_LEVEL_11 = TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_11"));

        public static final TagKey<Block> MIMICARIUM_REPLACEABLE_STONE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "mimicarium_replaceable"));
        public static final TagKey<Block> MIMICARIUM_REPLACEABLE_DEEPSLATE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "mimicarium_replaceable_deepslate"));
        public static final TagKey<Block> FAKESLATE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "fakeslate_replaceable"));
        public static final TagKey<Block> FAKESTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "fakestone_replaceable"));
        public static final TagKey<Block> DREADSTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "dreadstone_replaceable"));
        public static final TagKey<Block> THUNDERED_STONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "thundered_stone_replaceable"));
        public static final TagKey<Block> CORRUPTED_STONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "corrupted_stone_replaceable"));
        public static final TagKey<Block> VOIDSTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, "voidstone_replaceable"));


        public static final TagKey<Block> REINFORCED_DREADSTONE_BLOCKS = TagKey.of(RegistryKeys.BLOCK, AxonTechnologies.id("reinforced_dreadstone_blocks"));
    }
}
