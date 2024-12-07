package com.berksire.applewood.util;

import com.berksire.applewood.AppleWood;
import net.minecraft.resources.ResourceLocation;

public class AppleWoodIdentifier extends ResourceLocation {
    public AppleWoodIdentifier(String path) {
        super(AppleWood.MODID, path);
    }
}
