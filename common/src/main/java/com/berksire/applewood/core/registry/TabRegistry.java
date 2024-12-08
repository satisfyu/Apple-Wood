package com.berksire.applewood.core.registry;

import com.berksire.applewood.AppleWood;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("unused")
public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> APPLEWOOD_TABS = DeferredRegister.create(AppleWood.MODID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> APPLEWOOD_TAB = APPLEWOOD_TABS.register("applewood", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(ObjectRegistry.APPLE_PLANKS.get()))
            .title(Component.translatable("itemGroup.applewood.applewood_tab"))
            .displayItems((parameters, out) -> {
                out.accept(ObjectRegistry.APPLE_CHAIR.get());
                out.accept(ObjectRegistry.APPLE_TABLE.get());
                out.accept(ObjectRegistry.APPLE_CABINET.get());
                out.accept(ObjectRegistry.APPLE_DRAWER.get());
                out.accept(ObjectRegistry.APPLE_WINE_RACK_BIG.get());
                out.accept(ObjectRegistry.APPLE_WINE_RACK_SMALL.get());
                out.accept(ObjectRegistry.APPLE_WINE_RACK_MID.get());
                out.accept(ObjectRegistry.APPLE_LOG.get());
                out.accept(ObjectRegistry.APPLE_WOOD.get());
                out.accept(ObjectRegistry.STRIPPED_APPLE_LOG.get());
                out.accept(ObjectRegistry.STRIPPED_APPLE_WOOD.get());
                out.accept(ObjectRegistry.APPLE_BEAM.get());
                out.accept(ObjectRegistry.APPLE_PLANKS.get());
                out.accept(ObjectRegistry.APPLE_STAIRS.get());
                out.accept(ObjectRegistry.APPLE_SLAB.get());
                out.accept(ObjectRegistry.APPLE_FENCE.get());
                out.accept(ObjectRegistry.APPLE_FENCE_GATE.get());
                out.accept(ObjectRegistry.APPLE_BUTTON.get());
                out.accept(ObjectRegistry.APPLE_PRESSURE_PLATE.get());
                out.accept(ObjectRegistry.APPLE_DOOR.get());
                out.accept(ObjectRegistry.APPLE_SIGN_ITEM.get());
                out.accept(ObjectRegistry.APPLE_HANGING_SIGN_ITEM.get());
                out.accept(ObjectRegistry.APPLE_TRAPDOOR.get());
                out.accept(ObjectRegistry.APPLE_LATTICE.get());
                out.accept(ObjectRegistry.APPLE_BIG_TABLE.get());
                out.accept(ObjectRegistry.APPLE_SHELF.get());
                out.accept(ObjectRegistry.APPLE_BOAT.get());
                out.accept(ObjectRegistry.APPLE_CHEST_BOAT.get());
            })
            .build());

    public static void init() {
        APPLEWOOD_TABS.register();
    }
}
