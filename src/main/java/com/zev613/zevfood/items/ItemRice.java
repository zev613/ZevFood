package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemRice  extends ModItemSeed
{

    public ItemRice() 
    {
        super(ModBlocks.blockRiceBlock, Blocks.farmland);
        setUnlocalizedName("rice");
        setTextureName("zevfood:rice");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
