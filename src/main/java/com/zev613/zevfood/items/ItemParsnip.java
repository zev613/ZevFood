package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemParsnip extends ModItemSeedFood 
{

    public ItemParsnip() 
    {
        super(3, 0.3F, ModBlocks.blockParsnipBlock, Blocks.farmland);
        setUnlocalizedName("parsnip");
        setTextureName("zevfood:parsnip");
        setCreativeTab(ModTabs.tabNewFood);
    }
}