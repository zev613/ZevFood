package com.zev613.zevfood.tabs;

import com.zev613.zevfood.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTabs 
{
    public static CreativeTabs tabNewFood = new CreativeTabs("tabNewFood")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ModItems.corn;
        }
    };
}