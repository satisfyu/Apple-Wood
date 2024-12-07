package com.berksire.applewood.core.block.entity;

import com.berksire.applewood.core.registry.EntityTypeRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class AppleWoodSignBlockEntity extends SignBlockEntity {

    public AppleWoodSignBlockEntity(BlockEntityType<? extends AppleWoodSignBlockEntity> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public AppleWoodSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(EntityTypeRegistry.APPLE_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return EntityTypeRegistry.APPLE_SIGN.get();
    }
}