package com.berksire.applewood.core.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AppleWoodWoodType {
    public static final WoodType APPLE = WoodType.register(new WoodType(new AppleWoodIdentifier("apple").toString(), BlockSetType.OAK));
}
