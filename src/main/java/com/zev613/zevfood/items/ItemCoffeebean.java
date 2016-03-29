package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemCoffeebean  extends ModItemSeed
{

    public ItemCoffeebean() 
    {
        super(ModBlocks.blockCoffeeBlock, Blocks.farmland);
        setUnlocalizedName("coffeebean");
        setTextureName("zevfood:coffeebean");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
