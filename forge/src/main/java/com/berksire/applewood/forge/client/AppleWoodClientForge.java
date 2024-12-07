package com.berksire.applewood.forge.client;

import com.berksire.applewood.AppleWood;
import com.berksire.applewood.client.AppleWoodClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = AppleWood.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AppleWoodClientForge {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        AppleWoodClient.onInitializeClient();
    }

}
