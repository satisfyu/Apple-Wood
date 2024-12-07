package com.berksire.applewood.client.render.block.storage;

import com.berksire.applewood.core.block.entity.AppleWoodStorageBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

public interface AppleWoodStorageTypeRenderer {
    void render(AppleWoodStorageBlockEntity entity, PoseStack matrices, MultiBufferSource vertexConsumers, NonNullList<ItemStack> itemStacks);
}
