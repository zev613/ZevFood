package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemBlackberry extends ModItemSeedFood 
{

    public ItemBlackberry() 
    {
        super(1, 0.3F, ModBlocks.blockBlackberryBush, Blocks.farmland);
        setUnlocalizedName("blackberry");
        setTextureName("zevfood:blackberry");
        setCreativeTab(ModTabs.tabNewFood);
    }
}