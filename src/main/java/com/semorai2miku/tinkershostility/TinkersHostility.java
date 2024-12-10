package com.semorai2miku.tinkershostility;

import com.semorai2miku.tinkershostility.ModGroup.TinkersHostilityGroup;
import com.semorai2miku.tinkershostility.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.CreativeModeTab;

@Mod(Utils.MOD_ID)
public class TinkersHostility {

    //物品栏声明
    public static final CreativeModeTab itemGroup = new TinkersHostilityGroup();

    public TinkersHostility() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        //添加物品、方块的注册
        ItemInit.ITEMS.register(eventBus);
        //BlockInit.BLOCKS.register(eventBus);

    }
}
