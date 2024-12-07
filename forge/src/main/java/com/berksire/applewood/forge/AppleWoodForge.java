package com.berksire.applewood.forge;

import com.berksire.applewood.AppleWood;
import com.berksire.applewood.core.registry.FlammableBlockRegistry;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AppleWood.MODID)
public class AppleWoodForge {
    public AppleWoodForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(AppleWood.MODID, modEventBus);
        AppleWood.init();

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(FlammableBlockRegistry::registerFlammables);
        AppleWood.commonInit();
    }
}

