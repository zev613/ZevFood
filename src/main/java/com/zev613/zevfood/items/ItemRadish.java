package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemRadish extends ModItemSeedFood 
{

    public ItemRadish() 
    {
        super(1, 0.4F, ModBlocks.blockRadishBlock, Blocks.farmland);
        setUnlocalizedName("radish");
        setTextureName("zevfood:radish");
        setCreativeTab(ModTabs.tabNewFood);
    }
}