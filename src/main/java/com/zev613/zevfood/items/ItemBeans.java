package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemBeans extends ModItemSeedFood 
{

    public ItemBeans() 
    {
        super(3, 0.3F, ModBlocks.blockBeansBlock, Blocks.farmland);
        setUnlocalizedName("beans");
        setTextureName("zevfood:beans");
        setCreativeTab(ModTabs.tabNewFood);
    }
}