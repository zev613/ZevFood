package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.init.Blocks;

public class ItemCorn extends ModItemSeedFood 
{

    public ItemCorn() 
    {
        super(3, 0.4F, ModBlocks.blockCornBlock, Blocks.farmland);
        setUnlocalizedName("corn");
        setTextureName("zevfood:corn");
        setCreativeTab(ModTabs.tabNewFood);
    }
}