package com.zev613.zevfood.items;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.tabs.ModTabs;

import net.minecraft.init.Blocks;

public class ItemTurnipSeed  extends ModItemSeed
{

    public ItemTurnipSeed() 
    {
        super(ModBlocks.blockTurnipBlock, Blocks.farmland);
        setUnlocalizedName("turnipSeed");
        setTextureName("zevfood:turnipSeed");
        setCreativeTab(ModTabs.tabNewFood);
    }
}
