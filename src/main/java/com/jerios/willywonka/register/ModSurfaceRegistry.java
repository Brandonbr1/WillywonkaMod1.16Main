package com.jerios.willywonka.register;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.world.surface.ModSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModSurfaceRegistry {

    public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister
            .create(ForgeRegistries.SURFACE_BUILDERS, WillyWonka.MOD_ID);

    public static final RegistryObject<ModSurfaceBuilder> MOD_SURFACE_BUILDER = SURFACE_BUILDERS.register("test",
            () -> new ModSurfaceBuilder(SurfaceBuilderConfig.CODEC));


}
