package com.semorai2miku.tinkershostility.ModTab;

import com.semorai2miku.tinkershostility.init.BlockInit;
import com.semorai2miku.tinkershostility.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


//创造模式物品栏

public class TinkersHostilityTab {
    public static final CreativeModeTab itemTab = new CreativeModeTab("itemTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.obsidianIngot.get());
        }
    };

    public static final CreativeModeTab blockTab = new CreativeModeTab("blockTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.obsidianBlock.get());
        }
    };

    public static final CreativeModeTab foodTab = new CreativeModeTab("foodTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.obsidianApple.get());
        }
    };
}
