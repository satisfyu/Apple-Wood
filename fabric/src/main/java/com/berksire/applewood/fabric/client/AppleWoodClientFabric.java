package com.berksire.applewood.fabric.client;

import com.berksire.applewood.client.AppleWoodClient;
import com.berksire.applewood.core.entity.AppleWoodBoatEntity;
import com.berksire.applewood.core.util.AppleWoodIdentifier;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class AppleWoodClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AppleWoodClient.onInitializeClient();
        registerBoatModels();
    }

    private void registerBoatModels() {
        for (AppleWoodBoatEntity.Type type : AppleWoodBoatEntity.Type.values()) {
            EntityModelLayerRegistry.registerModelLayer(new ModelLayerLocation(new AppleWoodIdentifier(type.getModelLocation()), "main"), BoatModel::createBodyModel);
            EntityModelLayerRegistry.registerModelLayer(new ModelLayerLocation(new AppleWoodIdentifier(type.getChestModelLocation()), "main"), ChestBoatModel::createBodyModel);
        }
    }
}
