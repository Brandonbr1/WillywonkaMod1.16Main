package com.jerios.willywonka.items.custom;

import com.jerios.willywonka.enities.ExplosiveArrowEntity;
import com.jerios.willywonka.register.ModEnityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RegisterExplosiveArrow extends ArrowItem {
    public RegisterExplosiveArrow(Properties props) {
        super(props);
    }

    //@Override
    //public AbstractArrowEntity createArrow(World world, ItemStack ammoStack, LivingEntity shooter) {
        //return new ExplosiveArrowEntity(ModEnityType.EXPLOSIVE_ARROW.get(), shooter, world);
    //}

}
