package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemBarley  extends ModItemSeed
{

    public ItemBarley() 
    {
        super(ModBlocks.blockBarleyBlock, Blocks.farmland);
        setUnlocalizedName("barley");
        setTextureName("zevfood:barley");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
