package com.avtm.AVTMTech.item;

import com.avtm.AVTMTech.AVTMTech;
import com.avtm.AVTMTech.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AVTMTech.MOD_ID);

    public static final Supplier<CreativeModeTab> MODTESTE_ITEMS_TAB = CREATIVE_MODE_TAB.register("avtmtech_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBBER.get()))
                    .title(Component.translatable("creativetab.avtmtech.avtmtech_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBBER);
                        output.accept(ModBlocks.CIRURGYTABLE);
                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
