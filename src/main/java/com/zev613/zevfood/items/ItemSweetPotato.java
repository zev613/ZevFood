package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft .init.Blocks;

public class ItemSweetPotato extends ModItemSeedFood 
{

    public ItemSweetPotato() 
    {
        super(1, 0.4F, ModBlocks.blockSweetPotatoBlock, Blocks.farmland);
        setUnlocalizedName("sweetPotato");
        setTextureName("zevfood:sweetPotato");
        setCreativeTab(ModTabs.tabNewFood);
    }
}