
package com.jerios.willywonka.world.feature.features;

import com.jerios.willywonka.blocks.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

@SuppressWarnings({"unused"})
public class ModFeature extends Feature<NoFeatureConfig> {
    private static final BlockState CHOCLATE_BLOCK_TEST = ModBlocks.HARDENEDCHOCLATE.get().defaultBlockState();
    private static final BlockState STONE = Blocks.SHROOMLIGHT.defaultBlockState();



    public ModFeature(Codec<NoFeatureConfig> p_i231953_1_) {
        super(p_i231953_1_);
    }

    public boolean isAirOrLeaves(IWorldGenerationBaseReader reader, BlockPos pos){
        if(!(reader instanceof IWorldReader)){
            return reader.isStateAtPosition(pos, (blockState -> blockState.isAir() || blockState.is(BlockTags.LEAVES)));
        }
        else {
            return reader.isStateAtPosition(pos, blockState -> blockState.canBeReplacedByLeaves((IWorldReader) reader,pos));
        }

    }

    @Override
    public boolean place(ISeedReader reader, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {

        while (pos.getY() > 1 && isAirOrLeaves(reader, pos)) {
            pos = pos.below();
        }
        pos.above();

        for (int i = 0; i < 4; i++)
            setBlock(reader, pos.above(i), CHOCLATE_BLOCK_TEST);
        setBlock(reader, pos.above(1), STONE);

        return false;
    }
}

