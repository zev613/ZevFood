package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemRye  extends ModItemSeed
{

    public ItemRye() 
    {
        super(ModBlocks.blockRyeBlock, Blocks.farmland);
        setUnlocalizedName("rye");
        setTextureName("zevfood:rye");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
