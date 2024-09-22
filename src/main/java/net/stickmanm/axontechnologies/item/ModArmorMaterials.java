package net.stickmanm.axontechnologies.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.stickmanm.axontechnologies.AxonTechnologies;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> THUNDERANIUM = register("thunderanium", Map.of(
                    ArmorItem.Type.HELMET, 13,
                    ArmorItem.Type.CHESTPLATE, 17,
                    ArmorItem.Type.LEGGINGS, 15,
                    ArmorItem.Type.BOOTS, 10
            ),
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.THUNDERANIUM_INGOT),
            2f,
            0.1F,
            false);

    public static final RegistryEntry<ArmorMaterial> RED_THUNDERANIUM = register("red_thunderanium", Map.of(
                    ArmorItem.Type.HELMET, 16,
                    ArmorItem.Type.CHESTPLATE, 23,
                    ArmorItem.Type.LEGGINGS, 20,
                    ArmorItem.Type.BOOTS, 13
            ),
            35,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.RED_THUNDERANIUM_INGOT),
            2.5f,
            0.25F,
            false);

    public static final RegistryEntry<ArmorMaterial> DARK_THUNDERANIUM = register("dark_thunderanium", Map.of(
                    ArmorItem.Type.HELMET, 21,
                    ArmorItem.Type.CHESTPLATE, 28,
                    ArmorItem.Type.LEGGINGS, 26,
                    ArmorItem.Type.BOOTS, 19
            ),
            50,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT),
            3f,
            0.5F,
            false);

    public static final RegistryEntry<ArmorMaterial> CORRUPTINITE = register("corruptinite", Map.of(
                    ArmorItem.Type.HELMET, 20,
                    ArmorItem.Type.CHESTPLATE, 27,
                    ArmorItem.Type.LEGGINGS, 25,
                    ArmorItem.Type.BOOTS, 17
            ),
            60,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.CORRUPTINITE),
            3f,
            0.5F,
            false);

    public static final RegistryEntry<ArmorMaterial> DARK_THUNDERANIUM_AXON_ALLOY = register("dark_thunderanium_axon_alloy", Map.of(
                    ArmorItem.Type.HELMET, 31,
                    ArmorItem.Type.CHESTPLATE, 38,
                    ArmorItem.Type.LEGGINGS, 36,
                    ArmorItem.Type.BOOTS, 29
            ),
            115,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.AXON_ALLOY),
            5f,
            1F,
            false);

    public static final RegistryEntry<ArmorMaterial> CORRUPTINITE_AXON_ALLOY = register("corruptinite_axon_alloy", Map.of(
                    ArmorItem.Type.HELMET, 30,
                    ArmorItem.Type.CHESTPLATE, 37,
                    ArmorItem.Type.LEGGINGS, 35,
                    ArmorItem.Type.BOOTS, 27
            ),
            125,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.AXON_ALLOY),
            5f,
            1F,
            false);

    public static final RegistryEntry<ArmorMaterial> AXON_ALLOY = register("axon_alloy", Map.of(
                    ArmorItem.Type.HELMET, 28,
                    ArmorItem.Type.CHESTPLATE, 35,
                    ArmorItem.Type.LEGGINGS, 33,
                    ArmorItem.Type.BOOTS, 25
            ),
            105,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.AXON_ALLOY),
            5f,
            1F,
            false);

    public static RegistryEntry<ArmorMaterial> register(String id, Map<ArmorItem.Type, Integer> defensePoints,
                                                        int enchantability, RegistryEntry<SoundEvent> equipSound,
                                                        Supplier<Ingredient> repairIngredient, float toughness,
                                                        float knockbackResistance, boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(AxonTechnologies.id(id), "", dyeable)
        );

        var material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredient, layers,
                toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, AxonTechnologies.id(id), material);

        return RegistryEntry.of(material);
    }

    public static void registerModArmorMaterials() {}
}