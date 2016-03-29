package com.zev613.zevfood.init;

import com.zev613.zevfood.RegisterHelper;
import com.zev613.zevfood.blocks.BlockBarleyCrop;
import com.zev613.zevfood.blocks.BlockBeansCrop;
import com.zev613.zevfood.blocks.BlockBeetsCrop;
import com.zev613.zevfood.blocks.BlockBellpepperCrop;
import com.zev613.zevfood.blocks.BlockBlackberryBush;
import com.zev613.zevfood.blocks.BlockBlueberryBush;
import com.zev613.zevfood.blocks.BlockCarrotCake;
import com.zev613.zevfood.blocks.BlockCeleryCrop;
import com.zev613.zevfood.blocks.BlockCoffeeCrop;
import com.zev613.zevfood.blocks.BlockCornCrop;
import com.zev613.zevfood.blocks.BlockCranberryBush;
import com.zev613.zevfood.blocks.BlockCucumberCrop;
import com.zev613.zevfood.blocks.BlockGrapesCrop;
import com.zev613.zevfood.blocks.BlockKiwiCrop;
import com.zev613.zevfood.blocks.BlockLettuceCrop;
import com.zev613.zevfood.blocks.BlockParsnipCrop;
import com.zev613.zevfood.blocks.BlockPineappleCrop;
import com.zev613.zevfood.blocks.BlockRadishCrop;
import com.zev613.zevfood.blocks.BlockRaspberryBush;
import com.zev613.zevfood.blocks.BlockRhubarbCrop;
import com.zev613.zevfood.blocks.BlockRiceCrop;
import com.zev613.zevfood.blocks.BlockRyeCrop;
import com.zev613.zevfood.blocks.BlockStrawberryBush;
import com.zev613.zevfood.blocks.BlockSweetPotatoCrop;
import com.zev613.zevfood.blocks.BlockTomatoCrop;
import com.zev613.zevfood.blocks.BlockTurnipCrop;

import net.minecraft.block.Block;

public class ModBlocks 
{
	
//CROPS	
	
	public static Block blockBlueberryBush = new BlockBlueberryBush();
	
	public static Block blockStrawberryBush = new BlockStrawberryBush();
	
	public static Block blockCranberryBush = new BlockCranberryBush();
	
	public static Block blockCornBlock = new BlockCornCrop();
	
	public static Block blockLettuceBlock = new BlockLettuceCrop();
	
	public static Block blockPineappleBlock = new BlockPineappleCrop();
	
	public static Block blockTomatoBlock = new BlockTomatoCrop();
	
	public static Block blockRiceBlock = new BlockRiceCrop();
	
	public static Block blockBarleyBlock = new BlockBarleyCrop();
	
	public static Block blockTurnipBlock = new BlockTurnipCrop();
	
	public static Block blockRadishBlock = new BlockRadishCrop();
	
	public static Block blockBeetsBlock = new BlockBeetsCrop();
	
	public static Block blockKiwiBlock = new BlockKiwiCrop();
	
	public static Block blockGrapesBlock = new BlockGrapesCrop();
	
	public static Block blockBlackberryBush = new BlockBlackberryBush();
	
	public static Block blockCeleryBlock = new BlockCeleryCrop();
	
	public static Block blockBeansBlock = new BlockBeansCrop();

	public static Block blockBellpepperBlock = new BlockBellpepperCrop();

	public static Block blockCoffeeBlock = new BlockCoffeeCrop();

	public static Block blockCucumberBlock = new BlockCucumberCrop();

	public static Block blockParsnipBlock = new BlockParsnipCrop();

	public static Block blockRaspberryBush = new BlockRaspberryBush();

	public static Block blockRhubarbBlock = new BlockRhubarbCrop();

	public static Block blockRyeBlock = new BlockRyeCrop();

	public static Block blockSweetPotatoBlock = new BlockSweetPotatoCrop();
	

//NON CROP BLOCKS
	
	public static Block blockCarrotCake = new BlockCarrotCake();

	
//OTHER PLANTS
	
	
//TREES

	
	//public static Block blockLog = new ZALogs().setBlockName("blockLog");
	

	
	public static void init()
	{
		
//CROPS
		
		RegisterHelper.registerBlock(blockBlueberryBush);
		
		RegisterHelper.registerBlock(blockBlackberryBush);
		
		RegisterHelper.registerBlock(blockStrawberryBush);
		
		RegisterHelper.registerBlock(blockCranberryBush);
		
		RegisterHelper.registerBlock(blockCornBlock);
		
		RegisterHelper.registerBlock(blockLettuceBlock);
		
		RegisterHelper.registerBlock(blockPineappleBlock);
		
		RegisterHelper.registerBlock(blockTomatoBlock);
		
		RegisterHelper.registerBlock(blockRiceBlock);
		
		RegisterHelper.registerBlock(blockBarleyBlock);
		
		RegisterHelper.registerBlock(blockRadishBlock);
		
		RegisterHelper.registerBlock(blockBeetsBlock);
		
		RegisterHelper.registerBlock(blockKiwiBlock);
		
		RegisterHelper.registerBlock(blockGrapesBlock);
		
		RegisterHelper.registerBlock(blockTurnipBlock);
	
		RegisterHelper.registerBlock(blockCeleryBlock);
	
		RegisterHelper.registerBlock(blockBeansBlock);

		RegisterHelper.registerBlock(blockBellpepperBlock);

		RegisterHelper.registerBlock(blockCoffeeBlock);

		RegisterHelper.registerBlock(blockCucumberBlock);

		RegisterHelper.registerBlock(blockParsnipBlock);

		RegisterHelper.registerBlock(blockRaspberryBush);

		RegisterHelper.registerBlock(blockRhubarbBlock);

		RegisterHelper.registerBlock(blockRyeBlock);
		
		RegisterHelper.registerBlock(blockSweetPotatoBlock);
		
	//NON CROP BLOCKS
		
		RegisterHelper.registerBlock(blockCarrotCake);
	//OTHER PLANTS

		
	//Trees
		
		
	}
	
}
