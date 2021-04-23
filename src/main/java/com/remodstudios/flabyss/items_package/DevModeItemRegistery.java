package com.remodstudios.flabyss.items_package;

import com.remodstudios.remodcore.api.registry.ItemRegistry;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class DevModeItemRegistery extends ItemRegistry {
    public static final DevModeItemRegistery INSTANCE = new DevModeItemRegistery();

    public final RegistryObject<Item> SUCCUBUS_MILK = add("succubus_milk",
            new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(5F).build())
                    .maxCount(1)
    );
}
