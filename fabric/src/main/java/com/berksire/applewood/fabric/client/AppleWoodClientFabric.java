package com.berksire.applewood.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import com.berksire.applewood.client.AppleWoodClient;

public class AppleWoodClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AppleWoodClient.onInitializeClient();
    }
}
