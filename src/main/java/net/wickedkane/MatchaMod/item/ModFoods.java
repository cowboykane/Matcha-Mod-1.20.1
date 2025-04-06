package net.wickedkane.MatchaMod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MATCHA_COOKIE = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.6f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200),
                    0.1f).build();
}