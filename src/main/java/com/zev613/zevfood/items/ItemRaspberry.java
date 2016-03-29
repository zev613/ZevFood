package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.init.Blocks;

public class ItemRaspberry extends ModItemSeedFood 
{

    public ItemRaspberry() 
    {
        super(1, 0.3F, ModBlocks.blockRaspberryBush, Blocks.farmland);
        setUnlocalizedName("raspberry");
        setTextureName("zevfood:raspberry");
        setCreativeTab(ModTabs.tabNewFood);
    }
}