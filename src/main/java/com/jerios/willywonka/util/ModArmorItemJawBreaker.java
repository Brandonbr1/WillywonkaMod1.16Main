
package com.jerios.willywonka.util;

import com.google.common.collect.ImmutableMap;
import com.jerios.willywonka.util.ModMaterialArmor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Objects;

public class ModArmorItemJawBreaker extends ArmorItem {

    private static final Map<IArmorMaterial, Effect> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<IArmorMaterial, Effect>()
                    .put(ModMaterialArmor.CHOCLATEARMOR, Effects.DAMAGE_RESISTANCE)
                    .build();


    public ModArmorItemJawBreaker(IArmorMaterial p_i48534_1_, EquipmentSlotType p_i48534_2_, Properties p_i48534_3_) {
        super(p_i48534_1_, p_i48534_2_, p_i48534_3_);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }

        super.onArmorTick(stack, world, player);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<IArmorMaterial, Effect> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            IArmorMaterial mapArmorMaterial = entry.getKey();
            Effect mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, IArmorMaterial mapArmorMaterial, Effect mapStatusEffect) {
        boolean hasPlayerEffect = !Objects.equals(player.getEffect(mapStatusEffect), null);

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new EffectInstance(mapStatusEffect, 400));

        }
    }

    // armorItemInSlot
    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.inventory.getItem(0);
        ItemStack leggings = player.inventory.getItem(1);
        ItemStack breastplate = player.inventory.getItem(2);
        ItemStack helmet = player.inventory.getItem(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(IArmorMaterial material, PlayerEntity player) {
        ArmorItem boots = ((ArmorItem)player.inventory.getItem(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.inventory.getItem(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.inventory.getItem(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.inventory.getItem(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }

}
