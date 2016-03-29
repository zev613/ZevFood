package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemBlueberry extends ModItemSeedFood 
{

    public ItemBlueberry() 
    {
        super(1, 0.3F, ModBlocks.blockBlueberryBush, Blocks.farmland);
        setUnlocalizedName("blueberry");
        setTextureName("zevfood:blueberry");
        setCreativeTab(ModTabs.tabNewFood);
    }
}