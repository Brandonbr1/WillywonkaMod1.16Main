package com.jerios.willywonka.world.structure;

import com.jerios.willywonka.WillyWonka;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.FlatGenerationSettings;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class StructureConfig {

    public static final DeferredRegister<Structure<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, WillyWonka.MOD_ID);

    public static StructureFeature<?, ?> CONFIGURED_CANDY_HOUSE = ModStructureUtil.CANDY_HOUSE_1.get().configured(IFeatureConfig.NONE);

    /**
     * Registers the configured structure which is what gets added to the biomes.
     * Noticed we are not using a forge registry because there is none for configured structures.
     *
     * We can register configured structures at any time before a world is clicked on and made.
     * But the best time to register configured features by code is honestly to do it in FMLCommonSetupEvent.
     */
    public static void registerConfiguredStructures() {
        Registry<StructureFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new ResourceLocation(WillyWonka.MOD_ID, "configured_candy_house"), CONFIGURED_CANDY_HOUSE);


        FlatGenerationSettings.STRUCTURE_FEATURES.put(ModStructureUtil.CANDY_HOUSE_1.get(), CONFIGURED_CANDY_HOUSE);
    }
}
