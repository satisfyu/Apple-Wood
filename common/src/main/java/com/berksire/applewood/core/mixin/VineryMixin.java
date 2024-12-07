package com.berksire.applewood.core.mixin;

import dev.architectury.hooks.item.tool.AxeItemHooks;
import net.satisfy.vinery.core.Vinery;
import net.satisfy.vinery.core.registry.ObjectRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.berksire.applewood.core.registry.ObjectRegistry.*;

@Mixin(Vinery.class)
public abstract class VineryMixin {
    @Inject(method = "commonSetup", at = @At(value = "RETURN"), remap = false)
    private static void onCommonSetup(CallbackInfo ci) {
        AxeItemHooks.addStrippable(ObjectRegistry.APPLE_LOG.get(), STRIPPED_APPLE_LOG.get());
        AxeItemHooks.addStrippable(ObjectRegistry.APPLE_WOOD.get(), STRIPPED_APPLE_WOOD.get());
    }
}
