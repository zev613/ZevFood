package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemLettuce extends ModItemSeedFood 
{

    public ItemLettuce() 
    {
        super(3, 0.3F, ModBlocks.blockLettuceBlock, Blocks.farmland);
        setUnlocalizedName("lettuce");
        setTextureName("zevfood:lettuce");
        setCreativeTab(ModTabs.tabNewFood);
    }
}