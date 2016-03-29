package com.zev613.zevfood.init;

import com.zev613.zevfood.RegisterHelper;
import com.zev613.zevfood.items.GenericFood;
import com.zev613.zevfood.items.GenericItemFood;
import com.zev613.zevfood.items.ItemBarley;
import com.zev613.zevfood.items.ItemBeans;
import com.zev613.zevfood.items.ItemBeets;
import com.zev613.zevfood.items.ItemBellpepper;
import com.zev613.zevfood.items.ItemBlackberry;
import com.zev613.zevfood.items.ItemBlueberry;
import com.zev613.zevfood.items.ItemCelery;
import com.zev613.zevfood.items.ItemCheese;
import com.zev613.zevfood.items.ItemCorn;
import com.zev613.zevfood.items.ItemCranberry;
import com.zev613.zevfood.items.ItemCucumber;
import com.zev613.zevfood.items.ItemGrapes;
import com.zev613.zevfood.items.ItemKiwi;
import com.zev613.zevfood.items.ItemLettuce;
import com.zev613.zevfood.items.ItemParsnip;
import com.zev613.zevfood.items.ItemPineapple;
import com.zev613.zevfood.items.ItemRadish;
import com.zev613.zevfood.items.ItemRaspberry;
import com.zev613.zevfood.items.ItemRhubarb;
import com.zev613.zevfood.items.ItemRice;
import com.zev613.zevfood.items.ItemStrawberry;
import com.zev613.zevfood.items.ItemSweetPotato;
import com.zev613.zevfood.items.ItemTomatoSeed;
import com.zev613.zevfood.items.ItemTurnipSeed;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModItems
{
	
	public static Item tomatoSeed = new ItemTomatoSeed().setUnlocalizedName("tomatoSeed");

	public static Item cheese = new ItemCheese().setUnlocalizedName("cheese");
	
	public static Item cranberry = new ItemCranberry().setUnlocalizedName("cranberry");
	
	public static Item strawberry = new ItemStrawberry().setUnlocalizedName("strawberry");
	
	public static Item blueberry = new ItemBlueberry().setUnlocalizedName("blueberry");
	
	public static Item blackberry = new ItemBlackberry().setUnlocalizedName("blackberry");
	
	public static Item banana = new GenericFood(4, 0.4F, false).setUnlocalizedName("banana");
	
	public static Item corn = new ItemCorn().setUnlocalizedName("corn");
	
	public static Item corn2 = new GenericFood(3, 0.3F, false).setUnlocalizedName("corn2");

	public static Item greenApple = new GenericFood(4, 0.4F, false).setUnlocalizedName("greenApple");
	
	public static Item mango = new GenericFood(4, 0.4F, false).setUnlocalizedName("mango");
	
	public static Item orange = new GenericFood(4, 0.3F, false).setUnlocalizedName("orange");
	
	public static Item pineapple = new ItemPineapple().setUnlocalizedName("pineapple");
	
	public static Item tomato = new GenericFood(4, 0.4F, false).setUnlocalizedName("tomato");
	
	public static Item lettuce = new ItemLettuce().setUnlocalizedName("lettuce");
	
	public static Item peach = new GenericFood(4, 0.3F, false).setUnlocalizedName("peach");
	
	public static Item pear = new GenericFood(4, 0.3F, false).setUnlocalizedName("pear");
	
	public static Item pizza = new GenericFood(8, 0.8F, false).setUnlocalizedName("pizza");
	
	public static Item pizza2 = new GenericFood(8, 0.9F, false).setUnlocalizedName("pizza2");
	
	public static Item rice = new ItemRice().setUnlocalizedName("rice");
	
	public static Item barley = new ItemBarley().setUnlocalizedName("barley");

	public static Item radish = new ItemRadish().setUnlocalizedName("radish");
	
	public static Item beets = new ItemBeets().setUnlocalizedName("beets");

	public static Item kiwi = new ItemKiwi().setUnlocalizedName("kiwi");
	
	public static Item grapes = new ItemGrapes().setUnlocalizedName("grapes");
	
	public static Item turnip = new GenericFood(2, 0.3F, false).setUnlocalizedName("turnip");

	public static Item turnipSeed = new ItemTurnipSeed().setUnlocalizedName("turnipSeed");
	
	public static Item celery = new ItemCelery().setUnlocalizedName("celery");
	
	public static Item dough = new GenericItemFood().setUnlocalizedName("dough");
	
	public static Item flour = new GenericItemFood().setUnlocalizedName("flour");
	
	public static Item tomatoSauce = new GenericItemFood().setUnlocalizedName("tomatoSauce");

	public static Item coffeebeans = new GenericItemFood().setUnlocalizedName("coffeebeans");

	public static Item rye = new GenericItemFood().setUnlocalizedName("rye");

	public static Item beans = new ItemBeans().setUnlocalizedName("beans");

	public static Item bellpepper = new ItemBellpepper().setUnlocalizedName("bellpepper");

	public static Item cucumber = new ItemCucumber().setUnlocalizedName("cucumber");

	public static Item parsnip = new ItemParsnip().setUnlocalizedName("parsnip");

	public static Item sweetPotato = new ItemSweetPotato().setUnlocalizedName("sweetPotato");

	public static Item raspberry = new ItemRaspberry().setUnlocalizedName("raspberry");

	public static Item rhubarb = new ItemRhubarb().setUnlocalizedName("rhubarb");

	public static Item applePie = new GenericFood(5, 0.5F, false).setUnlocalizedName("applePie");

	public static Item carrotCake = new GenericFood(5, 0.5F, false).setUnlocalizedName("carrotCake");

	public static Item strawberryPie = new GenericFood(5, 0.5F, false).setUnlocalizedName("strawberryPie");

	public static Item cheeseCake = new GenericFood(5, 0.6F, false).setUnlocalizedName("cheeseCake");

	public static Item pumpkinCheeseCake = new GenericFood(5, 0.6F, false).setUnlocalizedName("pumpkinCheeseCake");

	public static Item blueberryPie = new GenericFood(5, 0.5F, false).setUnlocalizedName("blueberryPie");

	public static Item pumpkinSoup = new GenericFood(4, 0.5F, false).setUnlocalizedName("pumpkinSoup");

	public static Item turnipSoup = new GenericFood(4, 0.5F, false).setUnlocalizedName("turnipSoup");
	
	public static Item sweetPotatoPie = new GenericFood(5, 0.6F, false).setUnlocalizedName("sweetPotatoPie");

	public static Item raspberryPie = new GenericFood(5, 0.5F, false).setUnlocalizedName("raspberryPie");

	
        public static void init()
        {

		RegisterHelper.registerItem(tomato);

        RegisterHelper.registerItem(tomatoSeed);
        
        RegisterHelper.registerItem(cheese);
                
        RegisterHelper.registerItem(cranberry);
        
		RegisterHelper.registerItem(strawberry);
		
		RegisterHelper.registerItem(blueberry);
		
		RegisterHelper.registerItem(blackberry);
		
		RegisterHelper.registerItem(banana);
		
		RegisterHelper.registerItem(corn);
		
		RegisterHelper.registerItem(corn2);
		
		RegisterHelper.registerItem(greenApple);
		
		RegisterHelper.registerItem(mango);
		
		RegisterHelper.registerItem(orange);
		
		RegisterHelper.registerItem(pineapple);
				
		RegisterHelper.registerItem(lettuce);
		
		RegisterHelper.registerItem(peach);
		
		RegisterHelper.registerItem(pear);
		
		RegisterHelper.registerItem(pizza);
		
		RegisterHelper.registerItem(pizza2);
		
		RegisterHelper.registerItem(rice);
		
		RegisterHelper.registerItem(barley);

		RegisterHelper.registerItem(radish);
		
		RegisterHelper.registerItem(beets);
		
		RegisterHelper.registerItem(kiwi);
		
		RegisterHelper.registerItem(grapes);

		RegisterHelper.registerItem(turnip);

        RegisterHelper.registerItem(turnipSeed);
        
        RegisterHelper.registerItem(celery);
        
        RegisterHelper.registerItem(dough);
        
        RegisterHelper.registerItem(flour);
        
        RegisterHelper.registerItem(tomatoSauce);
        
        RegisterHelper.registerItem(coffeebeans);
        
        RegisterHelper.registerItem(carrotCake);
        
        RegisterHelper.registerItem(blueberryPie);
        
        RegisterHelper.registerItem(raspberryPie);

        RegisterHelper.registerItem(applePie);
        
        RegisterHelper.registerItem(sweetPotatoPie);

        RegisterHelper.registerItem(cheeseCake);

        RegisterHelper.registerItem(pumpkinCheeseCake);

        RegisterHelper.registerItem(strawberryPie);

        RegisterHelper.registerItem(turnipSoup);

        RegisterHelper.registerItem(pumpkinSoup);
        
        RegisterHelper.registerItem(rye);

        RegisterHelper.registerItem(beans);

        RegisterHelper.registerItem(bellpepper);

        RegisterHelper.registerItem(cucumber);

        RegisterHelper.registerItem(parsnip);

        RegisterHelper.registerItem(raspberry);

        RegisterHelper.registerItem(rhubarb);
        
        RegisterHelper.registerItem(sweetPotato);

        
        
//Seed Spawning        
        
        MinecraftForge.addGrassSeed(new ItemStack(rice), 4);
        
        MinecraftForge.addGrassSeed(new ItemStack(turnipSeed), 4);

        MinecraftForge.addGrassSeed(new ItemStack(tomatoSeed), 4);

        MinecraftForge.addGrassSeed(new ItemStack(barley), 4);
        
        MinecraftForge.addGrassSeed(new ItemStack(corn), 2);

        MinecraftForge.addGrassSeed(new ItemStack(radish), 2);

        MinecraftForge.addGrassSeed(new ItemStack(beets), 2);

        MinecraftForge.addGrassSeed(new ItemStack(lettuce), 2);
        
        MinecraftForge.addGrassSeed(new ItemStack(cranberry), 2);

        MinecraftForge.addGrassSeed(new ItemStack(strawberry), 2);

        MinecraftForge.addGrassSeed(new ItemStack(blueberry), 2);

        MinecraftForge.addGrassSeed(new ItemStack(blackberry), 2);

        MinecraftForge.addGrassSeed(new ItemStack(pineapple), 2);

        MinecraftForge.addGrassSeed(new ItemStack(kiwi), 2);

        MinecraftForge.addGrassSeed(new ItemStack(grapes), 2);

        MinecraftForge.addGrassSeed(new ItemStack(beans), 4);
        
        MinecraftForge.addGrassSeed(new ItemStack(rye), 4);

        MinecraftForge.addGrassSeed(new ItemStack(parsnip), 3);

        MinecraftForge.addGrassSeed(new ItemStack(celery), 3);

        MinecraftForge.addGrassSeed(new ItemStack(bellpepper), 3);

        MinecraftForge.addGrassSeed(new ItemStack(raspberry), 2);

        MinecraftForge.addGrassSeed(new ItemStack(coffeebeans), 4);

        MinecraftForge.addGrassSeed(new ItemStack(rhubarb), 3);

        MinecraftForge.addGrassSeed(new ItemStack(sweetPotato), 3);

        
        }
        
}