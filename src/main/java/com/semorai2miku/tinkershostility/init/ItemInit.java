package com.semorai2miku.tinkershostility.init;

import com.semorai2miku.tinkershostility.ModTab.TinkersHostilityTab;
import com.semorai2miku.tinkershostility.Utils;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//注册物品类
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final  RegistryObject<Item> steelIngot = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties().tab(TinkersHostilityTab.itemTab)));
    public static final  RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot",
            ()-> new Item(new Item.Properties().tab(TinkersHostilityTab.itemTab)));
    public static final  RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple",
            ()-> new Item(new Item.Properties().tab(TinkersHostilityTab.foodTab)));
    public static final RegistryObject<Item> zircon = ITEMS.register("zircon" ,
            () -> new Item(new Item.Properties().tab(TinkersHostilityTab.itemTab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
