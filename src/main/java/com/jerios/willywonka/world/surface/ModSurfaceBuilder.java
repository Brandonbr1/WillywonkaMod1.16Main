package com.jerios.willywonka.world.surface;

import com.jerios.willywonka.register.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

@SuppressWarnings("unused")
public class ModSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    public static BlockState HARDENEDCHOCLATE = ModBlocks.HARDENEDCHOCLATE.get().defaultBlockState();
    public static final BlockState TAFFY = ModBlocks.TAFFY_BLOCK.get().defaultBlockState();


    public static final SurfaceBuilderConfig HARDENEDCHOCLATECONFIG = new SurfaceBuilderConfig(HARDENEDCHOCLATE, HARDENEDCHOCLATE, HARDENEDCHOCLATE);
    public static final SurfaceBuilderConfig TAFFYCONFIG = new SurfaceBuilderConfig(TAFFY, TAFFY, TAFFY);

    public ModSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232136_1_) {
        super(p_i232136_1_);
    }

    @Override
    public void apply(Random random, IChunk p_205610_2_, Biome p_205610_3_, int p_205610_4_, int p_205610_5_, int p_205610_6_, double p_205610_7_, BlockState p_205610_9_, BlockState p_205610_10_, int p_205610_11_, long p_205610_12_, SurfaceBuilderConfig p_205610_14_) {

        if (random.nextInt(2) == 0) {
            SurfaceBuilder.DEFAULT.apply(random, p_205610_2_, p_205610_3_, p_205610_4_, p_205610_5_, p_205610_6_, p_205610_7_, p_205610_9_, p_205610_10_, p_205610_11_, p_205610_12_, HARDENEDCHOCLATECONFIG);
        }
        else  {
            SurfaceBuilder.DEFAULT.apply(random, p_205610_2_, p_205610_3_, p_205610_4_, p_205610_5_, p_205610_6_, p_205610_7_, p_205610_9_, p_205610_10_, p_205610_11_, p_205610_12_, TAFFYCONFIG);
        }


    }
}
