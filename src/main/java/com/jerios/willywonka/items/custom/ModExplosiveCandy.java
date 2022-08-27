
package com.jerios.willywonka.items.custom;

import com.jerios.willywonka.items.ModBowItem;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Properties;
import java.util.function.Predicate;

@SuppressWarnings({"unused"})

public class ModExplosiveCandy extends ModBowItem {

    public ModExplosiveCandy(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    protected double getArrowDamage(ItemStack bowStack, AbstractArrowEntity arrow) {
        int powerLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, bowStack);
        if (powerLevel > 0) {
            return arrow.getBaseDamage() + (double) powerLevel * 0.5D + 0.5D;
        } else {
            return arrow.getBaseDamage();
        }


    }

    public Predicate<ItemStack> getInventoryAmmoPredicate() {
        return (ammoStack) -> {
            return ammoStack.getItem() == Items.TNT;
        };
    }

}