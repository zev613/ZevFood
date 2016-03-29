package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemCranberry  extends ModItemSeedFood 
{

    public ItemCranberry() 
    {
        super(1, 0.3F, ModBlocks.blockCranberryBush, Blocks.farmland);
        setUnlocalizedName("cranberry");
        setTextureName("zevfood:cranberry");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
