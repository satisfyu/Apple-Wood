package com.berksire.applewood.core.block.entity;

import com.berksire.applewood.core.registry.EntityTypeRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class AppleWoodHangingSignBlockEntity extends AppleWoodSignBlockEntity {

    public AppleWoodHangingSignBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(EntityTypeRegistry.APPLE_HANGING_SIGN.get(), blockPos, blockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return EntityTypeRegistry.APPLE_HANGING_SIGN.get();
    }
}
