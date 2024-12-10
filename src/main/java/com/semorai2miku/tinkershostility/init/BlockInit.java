package com.semorai2miku.tinkershostility.init;

import com.semorai2miku.tinkershostility.ModTab.TinkersHostilityTab;
import com.semorai2miku.tinkershostility.TinkersHostility;
import com.semorai2miku.tinkershostility.Utils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Modifier;
import java.util.function.Supplier;

//注册方块类
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

//    public static final RegistryObject<Block> obsidianBlock = BLOCKS.register("obsidian_Block",
//            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(1.5F, 6.0F)
//                    .requiresCorrectToolForDrops()));

//    public static final RegistryObject<Item> obsidian_Block = ItemInit.ITEMS.register("obsidian_Block",
//            ()->new BlockItem(obsidianBlock.get(),new Item.Properties().tab(TinkersHostilityTab.blockTab)));

    public static final RegistryObject<Block> obsidianBlock = registerBlock("obsidian_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()),
            TinkersHostilityTab.blockTab);
    public static final RegistryObject<Block> zirconBlock = registerBlock("zircon_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()),
            TinkersHostilityTab.blockTab);
    public static final RegistryObject<Block> zirconOre = registerBlock("zircon_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()),
            TinkersHostilityTab.blockTab);


    //注册方块的时候自动注册对应物品
    // 注册Block，由于需要注册Block以及该Block的Item所以这里写了一个函数用于同时注册Block和Item
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registryBlockItem(name,toReturn,tab);
        return toReturn;
    }
    // 用于注册方块对应的物品，由于方块和物品是分开的，需要都注册，通过之前的ItemInit.ITEMS的注册方法注册Item，使用BlockItem创建方块的Item
    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ItemInit.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
