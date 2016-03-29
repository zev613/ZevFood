package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemCucumber extends ModItemSeedFood 
{

    public ItemCucumber() 
    {
        super(3, 0.3F, ModBlocks.blockCucumberBlock, Blocks.farmland);
        setUnlocalizedName("cucumber");
        setTextureName("zevfood:cucumber");
        setCreativeTab(ModTabs.tabNewFood);
    }
}