package com.berksire.applewood.core.block;

import com.berksire.applewood.core.block.entity.AppleWoodSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AppleWoodStandingSignBlock extends StandingSignBlock {
    public AppleWoodStandingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new AppleWoodSignBlockEntity(pPos, pState);
    }
}