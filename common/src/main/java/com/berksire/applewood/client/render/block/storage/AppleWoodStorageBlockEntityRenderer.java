package com.berksire.applewood.client.render.block.storage;

import com.berksire.applewood.core.block.AppleWoodStorageBlock;
import com.berksire.applewood.core.block.entity.AppleWoodStorageBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;


import java.util.HashMap;

public class AppleWoodStorageBlockEntityRenderer implements BlockEntityRenderer<AppleWoodStorageBlockEntity> {
    private static final HashMap<ResourceLocation, AppleWoodStorageTypeRenderer> STORAGE_TYPES = new HashMap<>();

    public static void registerStorageType(ResourceLocation name, AppleWoodStorageTypeRenderer renderer){
        STORAGE_TYPES.put(name, renderer);
    }

    public static AppleWoodStorageTypeRenderer getRendererForId(ResourceLocation name){
        return STORAGE_TYPES.get(name);
    }

    public AppleWoodStorageBlockEntityRenderer(){
    }

    @Override
    public void render(AppleWoodStorageBlockEntity entity, float tickDelta, PoseStack matrices, MultiBufferSource vertexConsumers, int light, int overlay) {
        if (entity == null || !entity.hasLevel()) {
            return;
        }

        BlockState state = entity.getBlockState();
        if (state.getBlock() instanceof AppleWoodStorageBlock sB) {
            NonNullList<ItemStack> itemStacks = entity.getInventory();
            matrices.pushPose();
            applyBlockAngle(matrices, state, 180);

            ResourceLocation type = sB.type();
            AppleWoodStorageTypeRenderer renderer = getRendererForId(type);

            if (renderer != null) {
                renderer.render(entity, matrices, vertexConsumers, itemStacks);
            }

            matrices.popPose();
        }
    }

    public static void applyBlockAngle(PoseStack matrices, BlockState state, float angleOffset) {
        float angle = state.getValue(AppleWoodStorageBlock.FACING).toYRot();
        matrices.translate(0.5, 0, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(angleOffset - angle));
    }
}
