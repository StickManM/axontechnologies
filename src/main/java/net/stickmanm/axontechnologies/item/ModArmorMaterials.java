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