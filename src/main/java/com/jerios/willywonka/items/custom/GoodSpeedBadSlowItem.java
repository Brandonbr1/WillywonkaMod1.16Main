
package com.jerios.willywonka.items.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;



public class GoodSpeedBadSlowItem extends Item {
    public GoodSpeedBadSlowItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 200, 2));
        target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 400, 3));

        return super.hurtEnemy(stack, target, attacker);

    }
}

