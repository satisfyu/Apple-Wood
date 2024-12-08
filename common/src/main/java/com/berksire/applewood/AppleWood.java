package com.berksire.applewood;

import com.berksire.applewood.core.registry.FlammableBlockRegistry;
import com.berksire.applewood.core.registry.EntityTypeRegistry;
import com.berksire.applewood.core.registry.ObjectRegistry;
import com.berksire.applewood.core.registry.TabRegistry;
import com.google.common.reflect.Reflection;
import dev.architectury.hooks.item.tool.AxeItemHooks;

public class AppleWood {
    public static final String MODID = "applewood";

    public static void init() {
        ObjectRegistry.init();
        EntityTypeRegistry.init();
        TabRegistry.init();
    }

    public static void commonInit() {
        Reflection.initialize(FlammableBlockRegistry.class);
        AxeItemHooks.addStrippable(ObjectRegistry.APPLE_LOG.get(), ObjectRegistry.STRIPPED_APPLE_LOG.get());
        AxeItemHooks.addStrippable(ObjectRegistry.APPLE_WOOD.get(), ObjectRegistry.STRIPPED_APPLE_WOOD.get());
    }
}

