package net.stickmanm.axontechnologies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;
import org.intellij.lang.annotations.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> MIMICARIUM_SMELTABLES = List.of(ModBlocks.MIMICARIUM_ORE, ModBlocks.DEEPSLATE_MIMICARIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, MIMICARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.MIMICARIUM,
                0.7f, 200, "mimicarium");

        offerBlasting(exporter, MIMICARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.MIMICARIUM,
                0.7f, 200, "mimicarium");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIMICARIUM_ORE, 1)
                .pattern("CCC")
                .pattern("CMC")
                .pattern("CCC")
                .input('C', Items.STONE)
                .input('M', ModItems.MIMICARIUM)
                .criterion(hasItem(ModItems.MIMICARIUM), conditionsFromItem(ModItems.MIMICARIUM))
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter);
    }
}
