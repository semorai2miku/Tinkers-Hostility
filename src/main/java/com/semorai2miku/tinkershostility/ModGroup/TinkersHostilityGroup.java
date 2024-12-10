package com.semorai2miku.tinkershostility.ModGroup;

import com.semorai2miku.tinkershostility.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


//创造模式物品栏
public class TinkersHostilityGroup extends CreativeModeTab {
    public TinkersHostilityGroup() {
        super("TinkersHostilityGroup");
    }
    @Override
    public  ItemStack makeIcon() {
        return new ItemStack(ItemInit.obsidian_ingot.get()); //#是注册物品的类的名字
    }

}
