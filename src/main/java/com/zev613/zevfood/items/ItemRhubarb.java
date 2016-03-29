package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemRhubarb extends ModItemSeedFood 
{

    public ItemRhubarb() 
    {
        super(3, 0.3F, ModBlocks.blockRhubarbBlock, Blocks.farmland);
        setUnlocalizedName("rhubarb");
        setTextureName("zevfood:rhubarb");
        setCreativeTab(ModTabs.tabNewFood);
    }
}