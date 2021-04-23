package com.remodstudios.flabyss;

import com.remodstudios.flabyss.items_package.DevModeItemRegistery;
import com.remodstudios.flabyss.items_package.ItemRegistery;
import com.remodstudios.flabyss.blocks_package.BlockRegistery;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("flabyss")
public class FlaringAbyssMain {

    public final String MOD_ID = "flabyss";

    private static final Logger LOGGER = LogManager.getLogger();

    public FlaringAbyssMain() {
        ItemRegistery.INSTANCE.init();
        BlockRegistery.INSTANCE.init();


        if (FMLEnvironment.production) {
            DevModeItemRegistery.INSTANCE.init();
        }
    }
}
