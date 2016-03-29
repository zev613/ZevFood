package com.zev613.zevfood.items;

import com.zev613.zevfood.Reference;
import com.zev613.zevfood.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemCheese extends ItemFood
{
	private PotionEffect[] effects;

	public ItemCheese() 
	{
	    super(3, 0.4F, false);
	    //This item will later have something special, and be derived from Milk somehow.
	    this.setTextureName(Reference.MODID + ":" + getUnlocalizedName());
	    this.setCreativeTab(ModTabs.tabNewFood);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
	
}
