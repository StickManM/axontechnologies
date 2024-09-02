package net.stickmanm.axontechnologies.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModBlocks {

    public static final Block MIMICARIUM_ORE = registerBlock("mimicarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.GOLD_ORE).strength(4.0f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block DEEPSLATE_MIMICARIUM_ORE = registerBlock("deepslate_mimicarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE).strength(5.0f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block FAKESTONE_IRON_ORE = registerBlock("fakestone_iron_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.IRON_ORE).requiresTool()));

    public static final Block FAKESTONE_GOLD_ORE = registerBlock("fakestone_gold_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.GOLD_ORE).requiresTool()));

    public static final Block FAKESLATE_IRON_ORE = registerBlock("fakeslate_iron_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE).requiresTool()));

    public static final Block FAKESLATE_GOLD_ORE = registerBlock("fakeslate_gold_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE).requiresTool()));

    //Thundered Tree
    public static final Block THUNDERED_LOG = registerBlock("thundered_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block THUNDERED_WOOD = registerBlock("thundered_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_THUNDERED_LOG = registerBlock("stripped_thundered_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_THUNDERED_WOOD = registerBlock("stripped_thundered_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));

    public static final Block THUNDERED_PLANKS = registerBlock("thundered_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2.0f)));
    public static final Block THUNDERED_LEAVES = registerBlock("thundered_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(1.0f)));

    //Portal Blocks
    public static final Block VOIDSTONE = registerBlock("voidstone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
    public static final Block MIMIMCARIUM_PORTAL_FRAME = registerBlock("mimicarium_portal_frame",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block THUNDERANIUM_PORTAL_FRAME = registerBlock("thunderanium_portal_frame",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block CORRUPTION_PORTAL_FRAME = registerBlock("corruption_portal_frame",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(4.2f).requiresTool()));

    //Dreadstone stuff + Dreadstone ores
    public static final Block DREADSTONE = registerBlock("dreadstone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(2.7f).requiresTool()));

    public static final Block REINFORCED_DREADSTONE = registerBlock("reinforced_dreadstone",
            new Block(AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_SLAB = registerBlock("reinforced_dreadstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_STAIRS = registerBlock("reinforced_dreadstone_stairs",
            new StairsBlock(ModBlocks.REINFORCED_DREADSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_WALL = registerBlock("reinforced_dreadstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_DOOR = registerBlock("reinforced_dreadstone_door",
            new DoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_TRAPDOOR = registerBlock("reinforced_dreadstone_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_GLASS = registerBlock("reinforced_dreadstone_glass",
            new TransparentBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block DREADSTONE_DIAMOND_ORE = registerBlock("dreadstone_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(7, 10),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresTool()));

    public static final Block DREADSTONE_THUNDERANIUM_ORE = registerBlock("dreadstone_thunderanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 17),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresTool()));

    public static final Block DREADSTONE_NETHERITE_ORE = registerBlock("dreadstone_netherite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 17),
                    AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS).requiresTool().strength(4.5f)));

    public static final Block VOID_COAL_ORE = registerBlock("void_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(7, 10),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE).requiresTool()));

    public static final Block VOID_COAL_BLOCK = registerBlock("void_coal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.4f).requiresTool()));

    //Mimic World
    public static final Block FAKESTONE = registerBlock("fakestone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(2.1f).requiresTool()));

    public static final Block OCTUPLE_COMPRESSED_COBBLESTONE = registerBlock("octuple_compressed_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE).strength(2.1f).requiresTool()));

    public static final Block FAKESLATE = registerBlock("fakeslate",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(2.4f).requiresTool()));

    //Thunderlands


    public static final Block CHARGED_DIRT = registerBlock("charged_dirt",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT).strength(0.6f)));

    public static final Block THUNDERED_STONE = registerBlock("thundered_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(3.1f).requiresTool()));

    public static final Block THUNDERANIUM_ORE = registerBlock("thunderanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(15, 25),
                    AbstractBlock.Settings.copy(ModBlocks.THUNDERED_STONE).strength(4.5f).requiresTool()));

    public static final Block RENDERIUM_ORE = registerBlock("renderium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(15, 25),
                    AbstractBlock.Settings.copy(ModBlocks.THUNDERED_STONE).strength(4.5f).requiresTool()));

    //Corruptionlands

    public static final Block CORRUPTED_DIRT = registerBlock("corrupted_dirt",
            new Block(AbstractBlock.Settings.copy(ModBlocks.CHARGED_DIRT).strength(0.8f)));

    public static final Block CORRUPTED_STONE = registerBlock("corrupted_stone",
            new Block(AbstractBlock.Settings.copy(ModBlocks.THUNDERED_STONE).strength(2.3f).requiresTool()));

    public static final Block CORRUPTION_BLOCK = registerBlock("corruption_block",
            new Block(AbstractBlock.Settings.copy(ModBlocks.THUNDERED_STONE).strength(2.8f).requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block CORRUPTINITE_ORE = registerBlock("corruptinite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(20, 27),
                    AbstractBlock.Settings.copy(ModBlocks.CORRUPTED_STONE).strength(4.6f).requiresTool()));

    public static final Block DENDERIUM_ORE = registerBlock("denderium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(20, 27),
                    AbstractBlock.Settings.copy(ModBlocks.CORRUPTED_STONE).strength(4.6f).requiresTool()));

    //Dimension Core Ores
    public static final Block MWDC_ORE = registerBlock("mimic_world_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(50, 100),
                    AbstractBlock.Settings.copy(ModBlocks.FAKESLATE).strength(255f, 3600f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block DCDC_ORE = registerBlock("dread_caverns_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(50, 100),
                    AbstractBlock.Settings.copy(ModBlocks.DREADSTONE).strength(255f, 3600f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block TLDC_ORE = registerBlock("thunderlands_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(50, 100),
                    AbstractBlock.Settings.copy(ModBlocks.THUNDERED_STONE).strength(255f, 3600f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CLDC_ORE = registerBlock("corruptionlands_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(50, 100),
                    AbstractBlock.Settings.copy(ModBlocks.CORRUPTED_STONE).strength(255f, 3600f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AxonTechnologies.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AxonTechnologies.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AxonTechnologies.LOGGER.info("Registering Mod blocks for " + AxonTechnologies.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
           //entries.add(ModBlocks.MIMICARIUM_ORE);
            //entries.add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE);
        });
    }
}
