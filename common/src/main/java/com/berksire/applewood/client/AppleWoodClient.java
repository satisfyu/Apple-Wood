package com.berksire.applewood.client;

import com.berksire.applewood.client.render.block.AppleWoodHangingSignRenderer;
import com.berksire.applewood.client.render.block.AppleWoodSignRenderer;
import com.berksire.applewood.client.render.block.storage.*;
import com.berksire.applewood.client.render.entity.AppleWoodBoatRenderer;
import com.berksire.applewood.core.registry.EntityTypeRegistry;
import com.berksire.applewood.core.registry.StorageTypeRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

import static com.berksire.applewood.core.registry.ObjectRegistry.*;

@Environment(EnvType.CLIENT)
public class AppleWoodClient {

    public static void onInitializeClient() {
        RenderTypeRegistry.register(RenderType.cutout(),
                APPLE_WINE_RACK_BIG.get(), APPLE_LATTICE.get(), APPLE_CHAIR.get(), APPLE_TABLE.get(), APPLE_WINE_RACK_MID.get()
        );

        BlockEntityRendererRegistry.register(EntityTypeRegistry.STORAGE_ENTITY.get(), context -> new AppleWoodStorageBlockEntityRenderer());
        BlockEntityRendererRegistry.register(EntityTypeRegistry.APPLE_SIGN.get(), AppleWoodSignRenderer::new);
        BlockEntityRendererRegistry.register(EntityTypeRegistry.APPLE_HANGING_SIGN.get(), AppleWoodHangingSignRenderer::new);
        registerNetherStorageType();
    }

    public static void preInitClient() {
        registerEntityRenderers();
    }


    public static void registerNetherStorageTypes(ResourceLocation location, AppleWoodStorageTypeRenderer renderer) {
        AppleWoodStorageBlockEntityRenderer.registerStorageType(location, renderer);
    }

    public static void registerNetherStorageType() {
        registerNetherStorageTypes(StorageTypeRegistry.BIG_BOTTLE, new AppleWoodBigBottleRenderer());
        registerNetherStorageTypes(StorageTypeRegistry.FOUR_BOTTLE, new AppleWoodFourBottleRenderer());
        registerNetherStorageTypes(StorageTypeRegistry.NINE_BOTTLE, new AppleWoodNineBottleRenderer());
        registerNetherStorageTypes(StorageTypeRegistry.SHELF, new AppleWoodShelfRenderer());
    }

    public static void registerEntityRenderers() {
        EntityRendererRegistry.register(EntityTypeRegistry.APPLE_BOAT, context -> new AppleWoodBoatRenderer<>(context, false));
        EntityRendererRegistry.register(EntityTypeRegistry.APPLE_CHEST_BOAT, context -> new AppleWoodBoatRenderer<>(context, true));
    }
}
