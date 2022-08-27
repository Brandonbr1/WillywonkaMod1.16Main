package com.jerios.willywonka.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

@SuppressWarnings("unused")
public class ModLickableSnozberries extends Block {
    public ModLickableSnozberries(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        new EffectInstance(Effects.CONFUSION , 900);
        return ActionResultType.SUCCESS;
    }
}
