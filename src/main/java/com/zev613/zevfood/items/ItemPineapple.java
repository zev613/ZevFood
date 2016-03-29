package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemPineapple  extends ModItemSeedFood 
{

    public ItemPineapple() 
    {
        super(4, 0.4F, ModBlocks.blockPineappleBlock, Blocks.farmland);
        setUnlocalizedName("pineapple");
        setTextureName("zevfood:pineapple");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
