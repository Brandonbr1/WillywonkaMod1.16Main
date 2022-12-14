
package com.jerios.willywonka.food;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.world.World;





public class FizzyLiftingDrinkItem extends Item {


    
    public FizzyLiftingDrinkItem(Item.Properties p_i225737_1_) {
            super(p_i225737_1_);
        }

        public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
            super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
            if (p_77654_3_ instanceof ServerPlayerEntity) {
                ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)p_77654_3_;
                CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, p_77654_1_);
                serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
            }

            if (!p_77654_2_.isClientSide) {
                p_77654_3_.addEffect(new EffectInstance(Effects.LEVITATION, 6000 , 1));
            }

            if (p_77654_1_.isEmpty()) {
                return new ItemStack(null);
            } else {
                if (p_77654_3_ instanceof PlayerEntity && !((PlayerEntity)p_77654_3_).abilities.instabuild) {
                    ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                    PlayerEntity playerentity = (PlayerEntity)p_77654_3_;
                    if (!playerentity.inventory.add(itemstack)) {
                        playerentity.drop(itemstack, false);
                    }
                }

                return p_77654_1_;
            }
        }


        public int getUseDuration(ItemStack p_77626_1_) {
            return 40;
        }

        public UseAction getUseAnimation(ItemStack p_77661_1_) {
            return UseAction.DRINK;
        }

        public SoundEvent getDrinkingSound() {
            return SoundEvents.BOTTLE_EMPTY;
        }

        public SoundEvent getEatingSound() {
            return SoundEvents.BOTTLE_EMPTY;
        }

        public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
            return DrinkHelper.useDrink(p_77659_1_, p_77659_2_, p_77659_3_);
        }


    
}

