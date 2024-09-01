package net.stickmanm.axontechnologies.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
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
