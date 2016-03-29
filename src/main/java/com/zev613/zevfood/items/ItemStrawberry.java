package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemStrawberry  extends ModItemSeedFood 
{

    public ItemStrawberry() 
    {
        super(1, 0.3F, ModBlocks.blockStrawberryBush, Blocks.farmland);
        setUnlocalizedName("strawberry");
        setTextureName("zevfood:strawberry");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
