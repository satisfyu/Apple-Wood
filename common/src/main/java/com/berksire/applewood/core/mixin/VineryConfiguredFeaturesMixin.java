package com.berksire.applewood.core.mixin;

import com.berksire.applewood.util.AppleWoodIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.satisfy.vinery.core.util.VineryIdentifier;
import net.satisfy.vinery.core.world.VineryConfiguredFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(VineryConfiguredFeatures.class)
public abstract class VineryConfiguredFeaturesMixin {

    /**
     * @author satisfy
     * @reason Let's have our own AppleTrees!
     */
    @Overwrite
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        if ("apple".equals(name) || "apple_variant".equals(name)) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, new AppleWoodIdentifier(name));
        }
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new VineryIdentifier(name));
    }
}
