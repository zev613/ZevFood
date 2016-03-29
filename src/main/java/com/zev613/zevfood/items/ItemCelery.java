package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemCelery extends ModItemSeedFood 
{

    public ItemCelery() 
    {
        super(3, 0.3F, ModBlocks.blockCeleryBlock, Blocks.farmland);
        setUnlocalizedName("celery");
        setTextureName("zevfood:celery");
        setCreativeTab(ModTabs.tabNewFood);
    }
}