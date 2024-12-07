package com.berksire.applewood.core.block;

import com.berksire.applewood.core.block.entity.AppleWoodHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AppleWoodWallHangingSignBlock extends WallHangingSignBlock {
    public AppleWoodWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new AppleWoodHangingSignBlockEntity(pPos, pState);
    }
}