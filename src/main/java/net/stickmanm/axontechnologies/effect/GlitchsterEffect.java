package net.stickmanm.axontechnologies.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class GlitchsterEffect extends StatusEffect {
    public GlitchsterEffect() {
        super(StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                0x98D982); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int Amplifier) {

        /*if(entity.hasStatusEffect(ModEffects.ANTIGLITCHSTER)) {
            if (!entity.getWorld().isClient()) {
                addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, Identifier.of("generic_movement_speed"), 0f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
                entity.removeStatusEffect(this);
            }
        }
        else{}*/
            if (!entity.getWorld().isClient()) {
                if(entity.isPlayer()){
                    ((PlayerEntity) entity).getHungerManager().add(Amplifier + 1, 1.0f);
                    //entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 10, 1, false, false, false));

                }
                addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, Identifier.ofVanilla("effect.strength"), 3.0f, EntityAttributeModifier.Operation.ADD_VALUE)
                        .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, Identifier.ofVanilla("effect.speed"), 3.0f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                        .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.ofVanilla("effect.attack_speed"), 15f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 10, 0, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 10, 0, false, false, false));
            }



        return super.applyUpdateEffect(entity, Amplifier);

    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}