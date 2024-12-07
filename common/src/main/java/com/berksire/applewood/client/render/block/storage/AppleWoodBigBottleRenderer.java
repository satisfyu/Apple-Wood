package com.berksire.applewood.client.render.block.storage;

import com.berksire.applewood.core.block.entity.AppleWoodStorageBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.satisfy.vinery.client.util.ClientUtil;
import net.satisfy.vinery.core.block.WineBottleBlock;

@Environment(EnvType.CLIENT)
public class AppleWoodBigBottleRenderer implements AppleWoodStorageTypeRenderer {
    @Override
    public void render(AppleWoodStorageBlockEntity entity, PoseStack matrices, MultiBufferSource vertexConsumers, NonNullList<ItemStack> itemStacks) {
        matrices.translate(-0.4, 0.07, -0.5);
        matrices.scale(0.8f, 0.8f, 0.9f);
        ItemStack stack = itemStacks.get(0);
        if (!stack.isEmpty() && stack.getItem() instanceof BlockItem blockItem) {
            ClientUtil.renderBlock(blockItem.getBlock().defaultBlockState().setValue(WineBottleBlock.FAKE_MODEL, false), matrices, vertexConsumers, entity);
        }
    }
}
