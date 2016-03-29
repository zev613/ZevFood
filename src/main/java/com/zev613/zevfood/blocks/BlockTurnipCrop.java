package com.zev613.zevfood.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.zev613.zevfood.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockTurnipCrop extends ModBlockCrops 
{
	public BlockTurnipCrop()
    {
 // Basic block setup
    setBlockName("turnipBlock");
    setBlockTextureName("zevfood:turnip_stage_0");
    }

/**
 * Returns the quantity of items to drop on block destruction.
 */
@Override
public int quantityDropped(int parMetadata, int parFortune, Random parRand)
{
    return (parMetadata/2);
}

public void setCropItem(Item cropItem)
{
ModItems.turnip = cropItem;
}

public void setSeedItem(Item seedItem)
{
ModItems.turnipSeed = seedItem;
}

//General
@Override
public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
{
ArrayList<ItemStack> drops = new ArrayList<ItemStack>();


{
drops.add(new ItemStack(ModItems.turnipSeed));
drops.add(new ItemStack(ModItems.turnip));
}
return drops;
}
/*
@Override
public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
{
    return ModItems.tomato;
}
*/
@Override
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister parIIconRegister)
{
      iIcon = new IIcon[maxGrowthStage+1];
      // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
      // to make generic should loop to maxGrowthStage
      iIcon[0] = parIIconRegister.registerIcon("zevfood:turnip_stage_0");
      iIcon[1] = parIIconRegister.registerIcon("zevfood:turnip_stage_0");
      iIcon[2] = parIIconRegister.registerIcon("zevfood:turnip_stage_1");
      iIcon[3] = parIIconRegister.registerIcon("zevfood:turnip_stage_1");
      iIcon[4] = parIIconRegister.registerIcon("zevfood:turnip_stage_2");
      iIcon[5] = parIIconRegister.registerIcon("zevfood:turnip_stage_2");
      iIcon[6] = parIIconRegister.registerIcon("zevfood:turnip_stage_3");
      iIcon[7] = parIIconRegister.registerIcon("zevfood:turnip_stage_3");
}
}