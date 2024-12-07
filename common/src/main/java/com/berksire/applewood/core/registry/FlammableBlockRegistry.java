package com.berksire.applewood.core.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class FlammableBlockRegistry {
    public static void registerFlammables() {
        addFlammable(5, 20,
                ObjectRegistry.APPLE_CHAIR.get(),
                ObjectRegistry.APPLE_TABLE.get(),
                ObjectRegistry.APPLE_CABINET.get(),
                ObjectRegistry.APPLE_DRAWER.get(),
                ObjectRegistry.APPLE_SHELF.get(),
                ObjectRegistry.APPLE_PLANKS.get(),
                ObjectRegistry.APPLE_STAIRS.get(),
                ObjectRegistry.APPLE_SLAB.get()
        );

        addFlammable(5, 5,
                ObjectRegistry.APPLE_FENCE.get(),
                ObjectRegistry.APPLE_FENCE_GATE.get(),
                ObjectRegistry.APPLE_BUTTON.get(),
                ObjectRegistry.APPLE_PRESSURE_PLATE.get(),
                ObjectRegistry.APPLE_DOOR.get(),
                ObjectRegistry.APPLE_TRAPDOOR.get()
        );

        addFlammable(30, 60,
                ObjectRegistry.APPLE_WOOD.get(),
                ObjectRegistry.APPLE_BEAM.get(),
                ObjectRegistry.STRIPPED_APPLE_WOOD.get(),
                ObjectRegistry.STRIPPED_APPLE_LOG.get()
        );
    }

    public static void addFlammable(int burnOdd, int igniteOdd, Block... blocks) {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        for (Block block : blocks) {
            fireBlock.setFlammable(block, burnOdd, igniteOdd);
        }
    }
}
