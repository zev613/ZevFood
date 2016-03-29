package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemGrapes extends ModItemSeedFood 
{

    public ItemGrapes() 
    {
        super(1, 0.3F, ModBlocks.blockGrapesBlock, Blocks.farmland);
        setUnlocalizedName("grapes");
        setTextureName("zevfood:grapes");
        setCreativeTab(ModTabs.tabNewFood);
    }
}