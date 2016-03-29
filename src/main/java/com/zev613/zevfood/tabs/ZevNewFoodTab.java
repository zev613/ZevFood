package com.zev613.zevfood.tabs;

import com.zev613.zevfood.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZevNewFoodTab extends CreativeTabs 
{

String name;
	
	public ZevNewFoodTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabNewFood") 
		{
			return ModItems.corn;
		}
		return null;
	}

}
