package com.berksire.applewood.core.registry;

import com.berksire.applewood.core.util.AppleWoodIdentifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.satisfy.vinery.core.util.VineryIdentifier;

import java.util.Set;

public class StorageTypeRegistry {
    public static final ResourceLocation BIG_BOTTLE = new AppleWoodIdentifier("big_bottle");
    public static final ResourceLocation FOUR_BOTTLE = new AppleWoodIdentifier("four_bottle");
    public static final ResourceLocation NINE_BOTTLE = new AppleWoodIdentifier("nine_bottle");
    public static final ResourceLocation SHELF = new VineryIdentifier("shelf");

    public static Set<Block> registerBlocks(Set<Block> blocks) {
        blocks.add(ObjectRegistry.APPLE_WINE_RACK_BIG.get());
        blocks.add(ObjectRegistry.APPLE_WINE_RACK_MID.get());
        blocks.add(ObjectRegistry.APPLE_WINE_RACK_SMALL.get());
        blocks.add(ObjectRegistry.APPLE_SHELF.get());
        return blocks;
    }
}
