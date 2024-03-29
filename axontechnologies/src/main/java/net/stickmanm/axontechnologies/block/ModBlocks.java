package net.stickmanm.axontechnologies.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.world.tree.ModSaplingGenerators;

public class ModBlocks {

    //Ore
    public static final Block MIMICARIUM_ORE = registerBlock("mimicarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.GOLD_ORE).strength(4.0f).requiresTool()));

    public static final Block DEEPSLATE_MIMICARIUM_ORE = registerBlock("deepslate_mimicarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE).strength(4.0f).requiresTool()));

    public static final Block FAKESTONE_IRON_ORE = registerBlock("fakestone_iron_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool()));

    public static final Block FAKESTONE_GOLD_ORE = registerBlock("fakestone_gold_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.GOLD_ORE).requiresTool()));

    public static final Block FAKESLATE_IRON_ORE = registerBlock("fakeslate_iron_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).requiresTool()));

    public static final Block FAKESLATE_GOLD_ORE = registerBlock("fakeslate_gold_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE).requiresTool()));

    //Thundered Tree
    public static final Block THUNDERED_LOG = registerBlock("thundered_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block THUNDERED_WOOD = registerBlock("thundered_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_THUNDERED_LOG = registerBlock("stripped_thundered_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_THUNDERED_WOOD = registerBlock("stripped_thundered_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));

    public static final Block THUNDERED_PLANKS = registerBlock("thundered_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f)));
    public static final Block THUNDERED_LEAVES = registerBlock("thundered_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(1.0f).requiresTool()));

    public static final Block THUNDERED_SAPLING = registerBlock("thundered_sapling",
            new SaplingBlock(ModSaplingGenerators.THUNDERED, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    //Portal Blocks
    public static final Block VOIDSTONE = registerBlock("voidstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool()));
    public static final Block MIMIMCARIUM_PORTAL_FRAME = registerBlock("mimicarium_portal_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block THUNDERANIUM_PORTAL_FRAME = registerBlock("thunderanium_portal_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block CORRUPTION_PORTAL_FRAME = registerBlock("corruption_portal_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.2f).requiresTool()));

    //Dreadstone + Dreadstone Ores
    public static final Block DREADSTONE = registerBlock("dreadstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.4f).requiresTool()));

    public static final Block REINFORCED_DREADSTONE = registerBlock("reinforced_dreadstone",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_SLAB = registerBlock("reinforced_dreadstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_STAIRS = registerBlock("reinforced_dreadstone_stairs",
            new StairsBlock(ModBlocks.REINFORCED_DREADSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OBSIDIAN).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_WALL = registerBlock("reinforced_dreadstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_DOOR = registerBlock("reinforced_dreadstone_door",
            new DoorBlock(BlockSetType.CRIMSON, FabricBlockSettings.copyOf(Blocks.OBSIDIAN).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_TRAPDOOR = registerBlock("reinforced_dreadstone_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, FabricBlockSettings.copyOf(Blocks.OBSIDIAN).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block REINFORCED_DREADSTONE_GLASS = registerBlock("reinforced_dreadstone_glass",
            new TransparentBlock(FabricBlockSettings.copyOf(Blocks.GLASS).resistance(3600000.0F).strength(255f).hardness(255f).requiresTool().luminance(15).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block DREADSTONE_DIAMOND_ORE = registerBlock("dreadstone_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(7, 10),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.4f).requiresTool()));

    public static final Block DREADSTONE_THUNDERANIUM_ORE = registerBlock("dreadstone_thunderanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 17),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.4f).requiresTool()));
    public static final Block DREADSTONE_NETHERITE_ORE = registerBlock("dreadstone_netherite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 17),
                    FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).strength(4.5f).requiresTool()));

    public static final Block VOID_COAL_ORE = registerBlock("void_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(7, 10),
                    FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(2.4f).requiresTool()));

    public static final Block VOID_COAL_BLOCK = registerBlock("void_coal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.4f).requiresTool()));



    //MISC

    //Mimic World
    public static final Block FAKESTONE = registerBlock("fakestone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.1f).requiresTool()));

    public static final Block OCTUPLE_COMPRESSED_COBBLESTONE = registerBlock("octuple_compressed_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(2.1f).requiresTool()));

    public static final Block FAKESLATE = registerBlock("fakeslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(2.4f).requiresTool()));

    //Thunderlands


    public static final Block CHARGED_DIRT = registerBlock("charged_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.6f)));

    public static final Block THUNDERED_STONE = registerBlock("thundered_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.1f).requiresTool()));

    public static final Block THUNDERANIUM_ORE = registerBlock("thunderanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(15, 25),
                    FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(4.0f).requiresTool()));

    public static final Block RENDERIUM_ORE = registerBlock("renderium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(15, 25),
                    FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(4.0f).requiresTool()));

    //Corruptionlands

    public static final Block CORRUPTED_DIRT = registerBlock("corrupted_dirt",
            new Block(FabricBlockSettings.copyOf(ModBlocks.CHARGED_DIRT).strength(0.8f)));

    public static final Block CORRUPTED_STONE = registerBlock("corrupted_stone",
            new Block(FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(2.3f).requiresTool()));
    public static final Block CORRUPTION_BLOCK = registerBlock("corruption_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(2.3f).requiresTool()));

    public static final Block CORRUPTINITE_ORE = registerBlock("corruptinite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(20, 27),
                    FabricBlockSettings.copyOf(ModBlocks.CORRUPTED_STONE).strength(4.0f).requiresTool()));

    public static final Block DENDERIUM_ORE = registerBlock("denderium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(20, 27),
                    FabricBlockSettings.copyOf(ModBlocks.CORRUPTED_STONE).strength(4.0f).requiresTool()));

    public static final Block MWDC_ORE = registerBlock("mimic_world_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(30, 37),
                    FabricBlockSettings.copyOf(ModBlocks.FAKESLATE).strength(5.0f).requiresTool()));

    public static final Block DCDC_ORE = registerBlock("dread_caverns_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(30, 37),
                    FabricBlockSettings.copyOf(ModBlocks.DREADSTONE).strength(5.0f).requiresTool()));

    public static final Block TLDC_ORE = registerBlock("thunderlands_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(30, 37),
                    FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(5.0f).requiresTool()));;

    public static final Block CLDC_ORE = registerBlock("corruptionlands_dimension_core_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(30, 37),
                    FabricBlockSettings.copyOf(ModBlocks.CORRUPTED_STONE).strength(5.0f).requiresTool()));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AxonTechnologies.MOD_ID, name), block);
    }



    private static Item registerBlockItem(String name, Block block){
        Item item = Registry.register(Registries.ITEM, new Identifier(AxonTechnologies.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;

    }




    public static void registerModBlocks() {
        AxonTechnologies.LOGGER.info("Registering ModBlocks for " + AxonTechnologies.MOD_ID);
    }
}
