
package com.jerios.willywonka.food;

import com.jerios.willywonka.items.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.*;
import net.minecraft.world.World;

@SuppressWarnings("unused")
public class InfiniCandy extends Item {

    public InfiniCandy(Item.Properties p_i225737_1_) {
        super(p_i225737_1_);

    }

    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
        if (p_77654_3_ instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)p_77654_3_;
        }

        if (p_77654_1_.isEmpty()) {
            return new ItemStack(ModItems.InfiniCandy.get() );
        } else {
            if (p_77654_3_ instanceof PlayerEntity && !((PlayerEntity)p_77654_3_).abilities.instabuild) {
                ItemStack itemstack = new ItemStack(ModItems.InfiniCandy.get());
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
        return UseAction.EAT;
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_EAT;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_EAT;
    }

    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        return DrinkHelper.useDrink(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}
