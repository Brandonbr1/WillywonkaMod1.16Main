
package com.jerios.willywonka.liquid;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.blocks.ModBlocks;
import com.jerios.willywonka.items.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModLiquid {

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, WillyWonka.MOD_ID);

    public static final RegistryObject<FlowingFluid> CHOCLATE_FLUID
            = FLUIDS.register("choclate_fluid", () -> new ForgeFlowingFluid.Source(ModLiquid.CHOCLATE_PROPERITIES));

    public static final RegistryObject<FlowingFluid> CHOCLATE_FLOWING
            = FLUIDS.register("choclate_flowing", () -> new ForgeFlowingFluid.Flowing(ModLiquid.CHOCLATE_PROPERITIES));

    public static final ForgeFlowingFluid.Properties CHOCLATE_PROPERITIES = new ForgeFlowingFluid.Properties(
            () -> CHOCLATE_FLUID.get(), () -> CHOCLATE_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL , WATER_FLOWING_RL)
            .density(1).luminosity(2).viscosity(4).sound(SoundEvents.WATER_AMBIENT).overlay((WATER_OVERLAY_RL))
            .color(0xbfFF6550)).slopeFindDistance(8).levelDecreasePerBlock(2)
            .block(() ->  ModLiquid.CLOCLATE_BLOCK.get()).bucket(() -> ModItems.CHOCLATEBUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> CLOCLATE_BLOCK = ModBlocks.BLOCKS.register("choclate_flow",
            () -> new FlowingFluidBlock(() -> ModLiquid.CHOCLATE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER)
                    .noOcclusion().harvestLevel(100).noDrops()));

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
