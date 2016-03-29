package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemBeets extends ModItemSeedFood 
{

    public ItemBeets() 
    {
        super(3, 0.3F, ModBlocks.blockBeetsBlock, Blocks.farmland);
        setUnlocalizedName("beets");
        setTextureName("zevfood:beets");
        setCreativeTab(ModTabs.tabNewFood);
    }
}