package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemKiwi  extends ModItemSeedFood 
{

    public ItemKiwi() 
    {
        super(3, 0.3F, ModBlocks.blockKiwiBlock, Blocks.farmland);
        setUnlocalizedName("kiwi");
        setTextureName("zevfood:kiwi");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
