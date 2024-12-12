package com.semorai2miku.tinkershostility.init;

import com.semorai2miku.tinkershostility.ModTab.TinkersHostilityTab;
import com.semorai2miku.tinkershostility.Utils;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
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

//  创建一个食物，nutrition(i) 回复i点饥饿度，saturationMod(j)饱和度为j点，
//  public static final RegistryObject<Item> Food = ITEMS.register("Food",
//    () -> new Item(new Item.Properties().tab()
//          .food(new FoodProperties.Builder()
//              .nutrition(i)
//              .saturationMod(j)
//              .effect(() -> new MobEffectInstance(MobEffects.药水效果, 持续时间, 0,false,true), 1.0F)
//          .alwaysEat().alwaysEat().build())));
    public static final RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple",
            () -> new Item(new Item.Properties().tab(TinkersHostilityTab.foodTab)
                    .food(new FoodProperties.Builder()
                            .nutrition(20)
                            .saturationMod(10)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 3*20, 0,false,true), 1.0F)
                            .alwaysEat().alwaysEat().build())));

    public static final RegistryObject<Item> zircon = ITEMS.register("zircon" ,
            () -> new Item(new Item.Properties().tab(TinkersHostilityTab.itemTab)));
    public static final RegistryObject<Item> rawZircon = ITEMS.register("raw_zircon" ,
            () -> new Item(new Item.Properties().tab(TinkersHostilityTab.itemTab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
