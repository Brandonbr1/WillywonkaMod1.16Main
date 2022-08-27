package com.jerios.willywonka.blocks;

import com.jerios.willywonka.world.dimension.ModDimensions;
import com.jerios.willywonka.world.dimension.ModTeleport;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ModHardenedChoclateBlock extends Block {
    public ModHardenedChoclateBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }




    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos,
                                             PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isClientSide()) {
            if (!player.isCrouching()) {
                MinecraftServer server = worldIn.getServer();

                if (server != null) {
                    if (worldIn.dimension() == ModDimensions.CHOCLATE_DIMENSION) {
                        ServerWorld overWorld = server.getLevel(World.OVERWORLD);
                        if (overWorld != null) {
                            player.changeDimension(overWorld, new ModTeleport(pos, false));
                        }
                    } else {
                        ServerWorld kjDim = server.getLevel(ModDimensions.CHOCLATE_DIMENSION);
                        if (kjDim != null) {
                            player.changeDimension(kjDim, new ModTeleport(pos, true));
                        }
                    }
                    return ActionResultType.SUCCESS;
                }
            }
        }

// onBlockActivated

        return super.use(state, worldIn, pos, player, handIn, hit);
    }

    }

