package com.zev613.zevfood.crafting;

import com.zev613.zevfood.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FoodRecipes 
{

	public static void init()
	{	

GameRegistry.addShapedRecipe(new ItemStack(ModItems.pizza), 
		new Object[] {
				"CCC", 
				"BBB", 
				"AAA", 
				'A', ModItems.dough, 'B', ModItems.tomatoSauce, 'C', ModItems.cheese});

GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomatoSauce, 3), 
		new Object[] {new ItemStack(ModItems.tomato, 2), new ItemStack(Items.water_bucket)});

GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cheese, 3), 
		new Object[] {new ItemStack(Items.sugar, 1), new ItemStack(Items.milk_bucket)});

GameRegistry.addSmelting(ModItems.flour, 
		new ItemStack(ModItems.barley), 0.3F);

GameRegistry.addSmelting(ModItems.dough, 
		new ItemStack(ModItems.flour), 0.3F);

	}
	
}
