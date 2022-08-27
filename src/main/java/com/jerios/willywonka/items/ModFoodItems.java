package com.jerios.willywonka.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoodItems {

    public static final Food CHOCLATEBAR = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 60), 0.05f).fast().nutrition(2).saturationMod(0.2f)
            .alwaysEat().build();
}
