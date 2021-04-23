package com.remodstudios.flabyss.items_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.remodcore.api.creative.CreativeTab;
import com.remodstudios.remodcore.api.creative.CreativeTabBuilder;
import com.remodstudios.remodcore.api.registry.ItemRegistry;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.loading.FMLEnvironment;

@SuppressWarnings({"unused", "RedundantSuppression"})
public class ItemRegistery extends ItemRegistry {
    public static final ItemRegistery INSTANCE = new ItemRegistery();

    public final CreativeTab tab = createBuilder().build();
    
    public final Item.Settings baseSettings = new Item.Settings().maxCount(64).group(tab);

    // Normal Items
    public final RegistryObject<Item> RIME_SHARD = add("rime_shard", baseSettings);


    // Special Items
    
    
    // Block Items
    
    
    public CreativeTabBuilder createBuilder() {
        return new CreativeTabBuilder("flabyss:group").setIcon(() -> {
            return RIME_SHARD;
        });
    }
}
