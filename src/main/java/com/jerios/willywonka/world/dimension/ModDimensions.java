package com.jerios.willywonka.world.dimension;

import com.jerios.willywonka.WillyWonka;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;


public class ModDimensions {
    public static final RegistryKey<World> CHOCLATE_DIMENSION = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(WillyWonka.MOD_ID, "choclate_dimension"));
}
