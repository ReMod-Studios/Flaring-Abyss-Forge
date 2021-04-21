package com.remodstudios.flabyss.misc_package;

import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public final class ModMaterials {

    // "materials go here" - LePichu
    public static final Material WILTSLATE_MATERIAL;
    public static final Material ARIDSTONE_MATERIAL;
    public static final Material RIMENIUM_MATERIAL;

    // "initialization go brr" - LePichu
    static {
        WILTSLATE_MATERIAL = (new Material.Builder(MaterialColor.GREEN_TERRACOTTA).build());
        ARIDSTONE_MATERIAL = (new Material.Builder(MaterialColor.ORANGE).build());
        RIMENIUM_MATERIAL = (new Material.Builder(MaterialColor.LIGHT_BLUE).build());
    }
}
