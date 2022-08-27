package com.jerios.willywonka.world;

import com.jerios.willywonka.WillyWonka;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WillyWonka.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        //ModStructureGeneration.generateStructures(event);

        // ModOreGeneration.generateOres(event);
        // ModFlowerGeneration.generateFlowers(event);
        // ModTreeGeneration.generateTrees(event);

        //ModEntityGeneration.onEntitySpawn(event);
    }
}
