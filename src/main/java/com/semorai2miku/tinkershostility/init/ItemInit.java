package com.semorai2miku.tinkershostility.init;

import com.semorai2miku.tinkershostility.TinkersHostility;
import com.semorai2miku.tinkershostility.Utils;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//注册物品类
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static Item register() {
        return new Item(new Item.Properties().tab(TinkersHostility.itemGroup));
    }
    public static RegistryObject<Item> steel_ingot = ITEMS.register("steel_ingot", ItemInit::register);
    public static RegistryObject<Item> obsidian_ingot = ITEMS.register("obsidian_ingot", ItemInit::register);
}
