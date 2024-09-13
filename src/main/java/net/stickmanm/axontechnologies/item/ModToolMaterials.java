package net.stickmanm.axontechnologies.item;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.datagen.ModTagList;

public enum ModToolMaterials implements ToolMaterial {
    THUNDERANIUM(3031, 13f, 10.0f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_5, 25, Ingredient.ofItems(ModItems.THUNDERANIUM_INGOT)),
    RED_THUNDERANIUM(6062, 20f, 12.5f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_6, 35, Ingredient.ofItems(ModItems.RED_THUNDERANIUM_INGOT)),
    DARK_THUNDERANIUM(12124, 30f, 13.9f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_7, 55, Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT)),
    CORRUPTINITE(12124, 25f, 13.25f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_7, 50, Ingredient.ofItems(ModItems.CORRUPTINITE)),
    CORRUPTINITE_AXON_ALLOY(24248, 45f, 22.5f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_10, 100, Ingredient.ofItems(ModItems.CORRUPTINITE)),
    DARK_THUNDERANIUM_AXON_ALLOY(24248, 50f, 25.0f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_10, 115, Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT)),
    AXON_ALLOY(24248, 40f, 21.5f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_10, 90, Ingredient.ofItems(ModItems.AXON_ALLOY)),

    RAZZORIUM(2147483647, 1000f, 330282346638528860000000000000000000000f, ModTagList.Blocks.INCORRECT_FOR_TOOL_LEVEL_10, 250, Ingredient.ofItems(ModItems.RAZZORIUM));

    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
