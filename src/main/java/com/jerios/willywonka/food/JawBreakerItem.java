
package com.jerios.willywonka.food;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;



public class JawBreakerItem extends Item {

    public JawBreakerItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
        if (p_77654_3_ instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)p_77654_3_;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, p_77654_1_);
            serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
        }

        if (!p_77654_2_.isClientSide) {
            p_77654_3_.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 6000 , 1));
        }

        if (p_77654_1_.isEmpty()) {
            return new ItemStack(null);
        } else {
            if (p_77654_3_ instanceof PlayerEntity && !((PlayerEntity)p_77654_3_).abilities.instabuild) {
                PlayerEntity playerentity = (PlayerEntity)p_77654_3_;
            }

            return p_77654_1_;
        }
    }

    public int getUseDuration(ItemStack p_77626_1_) {
        return 600;
    }

    public UseAction getUseAnimation(ItemStack p_77661_1_) {
        return UseAction.EAT;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.ANVIL_PLACE;
    }


}