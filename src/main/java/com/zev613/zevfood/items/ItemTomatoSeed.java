package com.zev613.zevfood.items;

import com.zev613.zevfood.tabs.ModTabs;
import com.zev613.zevfood.items.ModItemSeed;
import com.zev613.zevfood.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ItemTomatoSeed  extends ModItemSeed
{

    public ItemTomatoSeed() 
    {
        super(ModBlocks.blockTomatoBlock, Blocks.farmland);
        setUnlocalizedName("tomatoSeed");
        setTextureName("zevfood:tomatoSeed");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
