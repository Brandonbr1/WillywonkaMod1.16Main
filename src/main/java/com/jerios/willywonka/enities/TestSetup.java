package com.jerios.willywonka.enities;
import com.jerios.willywonka.client.enity.render.ExplosiveArrowRenderer;
import com.jerios.willywonka.register.ModEnityType;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class TestSetup {

    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEnityType.EXPLOSIVE_ARROW.get(), ExplosiveArrowRenderer::new);
    }

}
