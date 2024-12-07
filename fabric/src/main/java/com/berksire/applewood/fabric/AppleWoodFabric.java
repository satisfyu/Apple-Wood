package com.berksire.applewood.fabric;

import net.fabricmc.api.ModInitializer;
import com.berksire.applewood.AppleWood;

public class AppleWoodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AppleWood.init();
        AppleWood.commonInit();
    }
}
