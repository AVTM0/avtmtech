package com.avtm.AVTMTech.item;

import com.avtm.AVTMTech.AVTMTech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AVTMTech.MOD_ID);

    public static final DeferredItem<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
