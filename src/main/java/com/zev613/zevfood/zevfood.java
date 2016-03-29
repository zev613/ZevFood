package com.zev613.zevfood;

import com.zev613.zevfood.crafting.ModRecipes;
import com.zev613.zevfood.init.ModBlocks;
import com.zev613.zevfood.init.ModItems;
//import com.zev613.zevfood.generation.GeneralWorldGeneration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)


public class zevfood 
{
	
//GeneralWorldGeneration eventWorldGen = new GeneralWorldGeneration();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();

		ModBlocks.init();	
				
//GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);

		ModRecipes.init();
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
