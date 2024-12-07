package com.berksire.applewood;

import com.berksire.applewood.core.registry.FlammableBlockRegistry;
import com.berksire.applewood.core.registry.EntityTypeRegistry;
import com.berksire.applewood.core.registry.ObjectRegistry;
import com.berksire.applewood.core.registry.TabRegistry;
import com.google.common.reflect.Reflection;

public class AppleWood {
    public static final String MODID = "applewood";

    public static void init() {
        ObjectRegistry.init();
        EntityTypeRegistry.init();
        TabRegistry.init();
    }

    public static void commonInit() {
        Reflection.initialize(FlammableBlockRegistry.class);
    }
}

