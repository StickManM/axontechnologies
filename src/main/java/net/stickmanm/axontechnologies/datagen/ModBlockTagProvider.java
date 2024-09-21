package net.stickmanm.axontechnologies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MIMICARIUM_ORE)
                .add(ModBlocks.RENDERIUM_ORE)
                .add(ModBlocks.DENDERIUM_ORE)
                .add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE)
                .add(ModBlocks.FAKESLATE)
                .add(ModBlocks.FAKESTONE)
                .add(ModBlocks.FAKESLATE_IRON_ORE)
                .add(ModBlocks.FAKESLATE_GOLD_ORE)
                .add(ModBlocks.FAKESTONE_GOLD_ORE)
                .add(ModBlocks.FAKESTONE_IRON_ORE)
                .add(ModBlocks.DREADSTONE)
                .add(ModBlocks.REINFORCED_DREADSTONE)
                .add(ModBlocks.REINFORCED_DREADSTONE_DOOR)
                .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR)
                .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS)
                .add(ModBlocks.REINFORCED_DREADSTONE_SLAB)
                .add(ModBlocks.REINFORCED_DREADSTONE_WALL)
                .add(ModBlocks.REINFORCED_DREADSTONE_GLASS)
                .add(ModBlocks.DREADSTONE_DIAMOND_ORE)
                .add(ModBlocks.DREADSTONE_NETHERITE_ORE)
                .add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE)
                .add(ModBlocks.VOID_COAL_ORE)
                .add(ModBlocks.VOID_COAL_BLOCK)
                .add(ModBlocks.VOIDSTONE)
                .add(ModBlocks.OCTUPLE_COMPRESSED_COBBLESTONE)
                .add(ModBlocks.THUNDERED_STONE)
                .add(ModBlocks.CORRUPTION_PORTAL_FRAME)
                .add(ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                .add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .add(ModBlocks.THUNDERANIUM_ORE)
                .add(ModBlocks.CORRUPTED_STONE)
                .add(ModBlocks.CORRUPTION_BLOCK)
                .add(ModBlocks.CORRUPTINITE_ORE)
                .add(ModBlocks.MWDC_ORE)
                .add(ModBlocks.DCDC_ORE)
                .add(ModBlocks.CLDC_ORE)
                .add(ModBlocks.TLDC_ORE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.CHARGED_DIRT)
                .add(ModBlocks.CORRUPTED_DIRT);

        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.THUNDERED_STONE)
                .add(ModBlocks.CORRUPTED_STONE)
                .add(ModBlocks.DREADSTONE)
                .add(ModBlocks.FAKESTONE_IRON_ORE)
                .add(ModBlocks.FAKESLATE_IRON_ORE)
                .add(ModBlocks.OCTUPLE_COMPRESSED_COBBLESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MIMICARIUM_ORE)
                .add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE)
                .add(ModBlocks.VOIDSTONE)
                .add(ModBlocks.FAKESTONE_GOLD_ORE)
                .add(ModBlocks.FAKESLATE_GOLD_ORE)
                .add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DREADSTONE_NETHERITE_ORE)
                .add(ModBlocks.DREADSTONE_DIAMOND_ORE)
                .add(ModBlocks.THUNDERANIUM_PORTAL_FRAME);

        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_4)
                .add(ModBlocks.VOID_COAL_ORE)
                .add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE)
                .add(ModBlocks.VOID_COAL_BLOCK);

        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_5)
                .add(ModBlocks.THUNDERANIUM_ORE)
                .add(ModBlocks.RENDERIUM_ORE);

        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_6)
                .add(ModBlocks.CORRUPTINITE_ORE)
                .add(ModBlocks.DENDERIUM_ORE)
                .add(ModBlocks.CORRUPTION_PORTAL_FRAME)
                .add(ModBlocks.CORRUPTION_BLOCK)
                .addTag(ModTagList.Blocks.REINFORCED_DREADSTONE_BLOCKS);

        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_7);
        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_8);
        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_9);

                getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_10)
                .add(ModBlocks.TLDC_ORE)
                .add(ModBlocks.MWDC_ORE)
                .add(ModBlocks.CLDC_ORE)
                .add(ModBlocks.DCDC_ORE);

        getOrCreateTagBuilder(ModTagList.Blocks.NEEDS_TOOL_LEVEL_11);

        getOrCreateTagBuilder(ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_5)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_6)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_7)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_8)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_9)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_10);

        getOrCreateTagBuilder(ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_6)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_7)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_8)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_9)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_10);

        getOrCreateTagBuilder(ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_7)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_8)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_9)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_10);

        getOrCreateTagBuilder(ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_10)
                .addTag(ModTagList.Blocks.NEEDS_TOOL_LEVEL_11);

        getOrCreateTagBuilder(ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_INFINITE);


        getOrCreateTagBuilder(ModTagList.Blocks.REINFORCED_DREADSTONE_BLOCKS)
                .add(ModBlocks.REINFORCED_DREADSTONE)
                .add(ModBlocks.REINFORCED_DREADSTONE_DOOR)
                .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR)
                .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS)
                .add(ModBlocks.REINFORCED_DREADSTONE_SLAB)
                .add(ModBlocks.REINFORCED_DREADSTONE_WALL)
                .add(ModBlocks.REINFORCED_DREADSTONE_GLASS);

        getOrCreateTagBuilder(ModTagList.Blocks.MIMICARIUM_REPLACEABLE_STONE)
                .add(ModBlocks.FAKESTONE)
                .add(Blocks.IRON_ORE)
                .add(Blocks.COPPER_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.COAL_ORE)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DIORITE)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE)
                .add(Blocks.EMERALD_ORE);

        getOrCreateTagBuilder(ModTagList.Blocks.MIMICARIUM_REPLACEABLE_DEEPSLATE)
                .add(ModBlocks.FAKESLATE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.DEEPSLATE_COPPER_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.RAW_COPPER_BLOCK)
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.TUFF)
                .add(Blocks.DEEPSLATE_EMERALD_ORE);

        getOrCreateTagBuilder(ModTagList.Blocks.FAKESTONE_REPLACEABLE)
                .add(ModBlocks.FAKESTONE);

        getOrCreateTagBuilder(ModTagList.Blocks.FAKESLATE_REPLACEABLE)
                .add(ModBlocks.FAKESLATE);

        getOrCreateTagBuilder(ModTagList.Blocks.DREADSTONE_REPLACEABLE)
                .add(ModBlocks.DREADSTONE);

        getOrCreateTagBuilder(ModTagList.Blocks.THUNDERED_STONE_REPLACEABLE)
                .add(ModBlocks.THUNDERED_STONE);

        getOrCreateTagBuilder(ModTagList.Blocks.CORRUPTED_STONE_REPLACEABLE)
                .add(ModBlocks.CORRUPTED_STONE);

        getOrCreateTagBuilder(ModTagList.Blocks.VOIDSTONE_REPLACEABLE)
                .add(Blocks.BEDROCK);


        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                .addTag(ModTagList.Blocks.REINFORCED_DREADSTONE_BLOCKS);

        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                .addTag(ModTagList.Blocks.REINFORCED_DREADSTONE_BLOCKS);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.REINFORCED_DREADSTONE_DOOR);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.REINFORCED_DREADSTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.REINFORCED_DREADSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.CHARGED_DIRT)
                .add(ModBlocks.CORRUPTED_DIRT);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.THUNDERED_LOG)
                .add(ModBlocks.THUNDERED_WOOD)
                .add(ModBlocks.STRIPPED_THUNDERED_LOG)
                .add(ModBlocks.STRIPPED_THUNDERED_WOOD);

    }
}
