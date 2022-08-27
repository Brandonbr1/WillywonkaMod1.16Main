package com.jerios.willywonka.events;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.enities.GummyBearEnity;
import com.jerios.willywonka.enities.ModEnityType;
import com.jerios.willywonka.enities.OompaLoompaAgressiveEntity;
import com.jerios.willywonka.util.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WillyWonka.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        //event.put(ModEnityType.OOMPA_LOOMPA_AGRESSIVE.get(), OompaLoompaAgressiveEntity.setCustomAttributes().create());
        //event.put(ModEnityType.GUMMYBEAR.get(), GummyBearEnity.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
