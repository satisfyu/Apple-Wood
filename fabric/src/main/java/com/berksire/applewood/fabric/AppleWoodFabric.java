package com.berksire.applewood.fabric;

import com.berksire.applewood.core.registry.ObjectRegistry;
import dev.architectury.hooks.item.tool.AxeItemHooks;
import net.fabricmc.api.ModInitializer;
import com.berksire.applewood.AppleWood;

public class AppleWoodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AppleWood.init();
        AppleWood.commonInit();
        AxeItemHooks.addStrippable(ObjectRegistry.APPLE_LOG.get(), ObjectRegistry.STRIPPED_APPLE_LOG.get());
        AxeItemHooks.addStrippable(ObjectRegistry.APPLE_WOOD.get(), ObjectRegistry.STRIPPED_APPLE_WOOD.get());
    }
}
