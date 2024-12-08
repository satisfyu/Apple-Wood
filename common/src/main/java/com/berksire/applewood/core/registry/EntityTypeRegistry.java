package com.berksire.applewood.core.registry;

import com.berksire.applewood.AppleWood;
import com.berksire.applewood.core.block.entity.AppleWoodHangingSignBlockEntity;
import com.berksire.applewood.core.block.entity.AppleWoodSignBlockEntity;
import com.berksire.applewood.core.block.entity.AppleWoodStorageBlockEntity;
import com.berksire.applewood.core.entity.AppleWoodBoatEntity;
import com.berksire.applewood.core.entity.AppleWoodChestBoatEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.satisfy.vinery.platform.PlatformHelper;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class EntityTypeRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(AppleWood.MODID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<AppleWoodStorageBlockEntity>> STORAGE_ENTITY = BLOCK_ENTITY_TYPES.register("storage", () -> {Set<Block> blocks = StorageTypeRegistry.registerBlocks(new HashSet<>());return BlockEntityType.Builder.of(AppleWoodStorageBlockEntity::new, blocks.toArray(new Block[0])).build(null);});
    public static final RegistrySupplier<BlockEntityType<AppleWoodSignBlockEntity>> APPLE_SIGN = BLOCK_ENTITY_TYPES.register("apple_sign", () -> BlockEntityType.Builder.of(AppleWoodSignBlockEntity::new, ObjectRegistry.APPLE_SIGN.get(), ObjectRegistry.APPLE_WALL_SIGN.get()).build(null));
    public static final RegistrySupplier<BlockEntityType<AppleWoodHangingSignBlockEntity>> APPLE_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("apple_hanging_sign", () -> BlockEntityType.Builder.of(AppleWoodHangingSignBlockEntity::new, ObjectRegistry.APPLE_HANGING_SIGN.get(), ObjectRegistry.APPLE_WALL_HANGING_SIGN.get()).build(null));

    public static final Supplier<EntityType<AppleWoodBoatEntity>> APPLE_BOAT = PlatformHelper.registerBoatType("apple_boat", AppleWoodBoatEntity::new, MobCategory.MISC, 1.375F, 0.5625F, 10);
    public static final Supplier<EntityType<AppleWoodChestBoatEntity>> APPLE_CHEST_BOAT = PlatformHelper.registerBoatType("apple_chest_boat", AppleWoodChestBoatEntity::new, MobCategory.MISC, 1.375F, 0.5625F, 10);

    public static void init() {
        BLOCK_ENTITY_TYPES.register();
    }
}
