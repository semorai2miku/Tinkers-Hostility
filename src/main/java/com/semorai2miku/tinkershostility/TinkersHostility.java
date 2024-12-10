package com.semorai2miku.tinkershostility;

import com.semorai2miku.tinkershostility.ModTab.TinkersHostilityTab;
import com.semorai2miku.tinkershostility.init.BlockInit;
import com.semorai2miku.tinkershostility.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.CreativeModeTab;

import java.util.SplittableRandom;

@Mod(Utils.MOD_ID)
public class TinkersHostility {

    public TinkersHostility() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        //添加物品、方块的注册
        ItemInit.register(eventBus);
        BlockInit.register(eventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }



}
