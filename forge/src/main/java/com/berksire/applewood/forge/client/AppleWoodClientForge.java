package com.berksire.applewood.forge.client;

import com.berksire.applewood.AppleWood;
import com.berksire.applewood.client.AppleWoodClient;
import com.berksire.applewood.core.entity.AppleWoodBoatEntity;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = AppleWood.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AppleWoodClientForge {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        AppleWoodClient.onInitializeClient();
    }

    @SubscribeEvent
    public static void onClientSetup(RegisterEvent event) {
        AppleWoodClient.preInitClient();
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (AppleWoodBoatEntity.Type type : AppleWoodBoatEntity.Type.values()) {
            event.registerLayerDefinition(new ModelLayerLocation(new ResourceLocation(AppleWood.MODID, type.getModelLocation()), "main"), BoatModel::createBodyModel);
            event.registerLayerDefinition(new ModelLayerLocation(new ResourceLocation(AppleWood.MODID, type.getChestModelLocation()), "main"), ChestBoatModel::createBodyModel);
        }
    }
}
