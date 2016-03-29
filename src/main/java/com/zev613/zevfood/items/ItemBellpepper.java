package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemBellpepper extends ModItemSeedFood 
{

    public ItemBellpepper() 
    {
        super(3, 0.3F, ModBlocks.blockBellpepperBlock, Blocks.farmland);
        setUnlocalizedName("bellpepper");
        setTextureName("zevfood:bellpepper");
        setCreativeTab(ModTabs.tabNewFood);
    }
}