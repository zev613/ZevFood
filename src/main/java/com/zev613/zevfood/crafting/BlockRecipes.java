package com.zev613.zevfood.crafting;

import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockRecipes 
{

	public static void init()
	{	
		
		
//SHAPED RECIPES		

		/*
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethystBlock), 
				new Object[] {
					"AAA", 
					"AAA", 
					"AAA", 
					'A', ModItems.amethystIngot});
		*/
		

		//SHAPELESS RECIPES		
		
		
		//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.aquaStone, 4), Items.bucket, 1, 
				//new Object[] {new ItemStack(Blocks.stone, 2), Items.bucket, 1});

		
//SMELTING RECIPES		
		
/*
		GameRegistry.addSmelting(ModBlocks.rubyBlock, 
				new ItemStack(ModItems.rubyIngot), 0.1F);
*/

		
	}
	
}
